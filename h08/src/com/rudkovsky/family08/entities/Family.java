package com.rudkovsky.family08.entities;

import com.rudkovsky.family05.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Family {
    private Human mother;
    private Human father;
    private List<Object> children = new ArrayList<>();
    private Set<Object> pet;

    public Human getMother() {
        return mother;
    };

    public void setMother(Human mother) {
        this.mother = mother;
    };

    public Human getFather() {
        return father;
    };

    public void setFather(Human father) {
        this.father = father;
    };

    public List<Object> getChildren() {
        return children;
    };

    public void setChildren(List<Object> children) {
        this.children = children;
    };

    private String process(Pet origin) {
        return Optional.ofNullable(origin)
                .map(s -> String.format("Hello", s.getNickname()))
                .orElse(">> I don't have any pet <<");
    }

    public Set<Object> getPet() {
        return pet;
    }

    public void setPet(Set<Object> pet) {
        this.pet = pet;
    };

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        father.setFamily(this);
        mother.setFamily(this);
    };

    public void addChild(Human child) {
        children.add(child);
    };

    public void deleteChild(Human childToDelete) {
        children.remove(childToDelete);
    };


    public int countFamily() {
        return children.size() + 2;
    };

    @Override
    public String toString() {
        return "Family={" +
                this.getMother() +
                this.getFather() +
                ", children=" + children +
                ", pet={" + this.getPet() +
                '}';
    };

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Family family = (Family) obj;
        return mother.equals(family.mother) &&
                father.equals(family.father);
    };

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Family:{"
                +"mother =" + mother
                + ", father =" + father
                + ", children =" + children
                + ", pet = " + pet
                + '}' + "destroyed" + '\n');
    }
}
