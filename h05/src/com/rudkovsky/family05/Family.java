package com.rudkovsky.family05;

import java.util.Arrays;

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

    public boolean isChildDeleted(int index) {
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
        return 0;
    };

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                '}';
    };
}
