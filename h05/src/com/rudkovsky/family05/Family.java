package com.rudkovsky.family05;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children = new Human[0];
    private Pet pet = new Pet("Dog", "Max", 4);

    static {
        System.out.printf("New class <<%s>> was loaded\n", Family.class.getSimpleName());
    }

    {
        System.out.printf("New instance of <<%s>>\n", Family.class.getSimpleName());
    }

    public Family() {
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, Human[] children) {
        this(mother, father);
        this.children = children;
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this(mother, father, children);
        this.pet = pet;
    }

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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        child.setFamily(this);
        Human[] tempArr = new Human[children.length + 1];
        System.arraycopy(children, 0, tempArr, 0, children.length);
        tempArr[tempArr.length - 1] = child;
        children = tempArr;

    }

    public boolean deleteChildv1(int index) {
        if (this.children == null
                || index < 0
                || index > this.children.length - 1) {
            return false;
        }
        Human[] tmp = new Human[this.children.length - 1];

        for (int i = 0; i < index; i++) {
            tmp[i] = this.children[i];
        }

        for (int i = index; i < this.children.length - 1; i++) {
            tmp[i] = this.children[i + 1];
        }
        this.children = tmp;
        return true;
    }

    public boolean deleteChildv2(int index) {
        if (this.children == null
                || index < 0
                || index > this.children.length - 1) {
            return false;
        }

        Human[] tmp = new Human[this.children.length - 1];
        for (int i = 0, j = 0; i < this.children.length; i++) {
            if (i != index) {
                tmp[j++] = this.children[i];
            }
        }
        this.children = tmp;
        return true;
    }

    public boolean deleteChildv3(int index) {
        if (this.children == null
                || index < 0
                || index > this.children.length - 1) {
            return false;
        }
        for (int i = index; i < this.children.length - 1; i++) {
            this.children[i] = this.children[i + 1];
        }
        return true;
    }

    public boolean deleteChildv4(int index) {
        if (this.children == null
                || index < 0
                || index > this.children.length - 1) {
            return false;
        }
        Human[] tmp = new Human[this.children.length - 1];
        System.arraycopy(this.children, 0, tmp, 0, index);
        System.arraycopy(this.children, index + 1, tmp, index, this.children.length - index - 1);

        this.children = tmp;
        return true;
    }

    public int findObjectIndex(Human o) {
        int index = -1;
        for (int i = 0; i < children.length; i++) {
            if (o.equals(children[i])) {
                index = i;
            }
        }
        return index;
    }


    public boolean deleteChild(Human child) {
        int index = findObjectIndex(child);
        deleteChildv4(index);
        return true;
    }

    public int count() {
        return this.children.length + 2;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) && father.equals(family.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }

    @Override
    public String toString() {
        return String.format(" Mother: %s; Father: %s; children: %s; pet: $s",
                mother.getName(), father.getName(), Arrays.toString(children), pet.getSpecies());
    }
}
