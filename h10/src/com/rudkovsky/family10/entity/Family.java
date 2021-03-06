package com.rudkovsky.family10.entity;

import java.util.List;
import java.util.Objects;

public class Family {
    public Human mother;
    public Human father;
    private List<Object> children;
    public List<com.rudkovsky.family10.entity.Pet> pets;


    public Family() {
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, List<Object> children, List<com.rudkovsky.family10.entity.Pet> pets) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pets = pets;
    }

    // Setter and getters
    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Object> getChildren() {
        return children;
    }

    public void setChildren(List<Object> children) {
        this.children = children;
    }

    public List<com.rudkovsky.family10.entity.Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void addChild(Human child) {
        children.add(child);
    }

    public void deleteChild(Human childToDel) {
        children.remove(childToDel);
    }

    public int countFamily(){
        int count = children.size() + 2;
        System.out.println("Family size " + count + "persons");
        return count;
    }

    public int addPet() {
        return 1;
    }



    @Override
    public String toString() {
        return "Family --> {" +
                "mother: " + mother + "; " + '\n' +
                "father: " + father + "; " + '\n' +
                "children: " + children + "; " + '\n' +
                "pet=" + pets +  "; " + '\n' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) &&
                father.equals(family.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }

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
