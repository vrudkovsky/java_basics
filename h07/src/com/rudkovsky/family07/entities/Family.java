package com.rudkovsky.family07.entities;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children = new Human[0];
    private Pet pet;

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

    public Human[] getChildren() {
        return children;
    };

    public void setChildren(Human[] children) {
        this.children = children;
    };

    public Pet getPet() {
        return pet;
    };

    public void setPet(Pet pet) {
        this.pet = pet;
    };

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        father.setFamily(this);
        mother.setFamily(this);
    };

    public void addChild(Human child) {
        Human[] temp = new Human[children.length + 1];
        System.arraycopy(children, 0, temp, 0, children.length);
        temp[temp.length - 1] = child;
        child.setFamily(this);
        children = temp;
    };

    public void deleteChild(Human childToDelete) {
        int index = -1;

        for (int i = 0; i < children.length; i++) {
            if (childToDelete.equals(children[i])) {
                index = i;
            }
        }

        deleteChild(index);
    };

    public boolean deleteChild(int index) {
        if (index < 0 || index > children.length - 1) {
            return false;
        }
        Human[] temp = new Human[this.children.length - 1];
        for (int i = 0; i < children.length; i++) {
            if (i < index) {
                temp[i] = this.children[i];
            } else if (i > index) {
                temp[i - 1] = this.children[i];
            }
        }
        this.children = temp;
        return true;
    };

    public int countFamily() {
        return this.children.length + 2;
    };

    @Override
    public String toString() {
        return "Family={" +
                this.getMother() +
                this.getFather() +
                ", children=" + Arrays.toString(children) +
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
    public int hashCode() {
        return Objects.hash(mother, father);
    };
}
