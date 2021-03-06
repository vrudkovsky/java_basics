package com.rudkovsky.family09.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private List<Pet> pets;

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

    public List<Human> getChildren() {
        return children;
    };

    public void setChildren(List<Human> children) {
        this.children = children;
    };

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

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
                ", pet={" + this.getPets() +
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
                + ", pet = " + pets
                + '}' + "destroyed" + '\n');
    }
}
