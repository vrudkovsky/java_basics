package com.rudkovsky.family05;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children = new Human[0];;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        father.setFamily(this);
        mother.setFamily(this);
    }

    public void addChild(Human child) {
        child.setFamily(this);
        Human[] tempArr = new Human[children.length + 1];
        System.arraycopy(children, 0, tempArr, 0, children.length);
        tempArr[tempArr.length - 1] = child;
        child.setFamily(this);
        children = tempArr;
    }

    public int findChildIndex(Human child) {
        int index = -1;
        for (int i = 0; i < children.length; i++) {
            if (child.equals(children[i])) {
                index = i;
            }
        }
        return index;
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index > this.children.length - 1) return false;

        Human[] tmpChildren =new Human[this.children.length - 1];
        for (int i = 0; i < children.length; i++) {
            if (i < index) {
                tmpChildren[i] =  this.children[i];
            } else if (i > index) {
                tmpChildren[i] = this.children[i];
            }
        }
        this.children = tmpChildren;
        return true;
    }

    public void deleteChild(Human child) {
        int index = findChildIndex(child);
        deleteChild(index);
    }


    public void greetPet() {
        System.out.printf("Hello %s!/n", pet.getNickname());
    }

    public void describePet() {
        System.out.printf("I have a %s. He is %d years old and he is %s/n",
                pet.getSpecies(), pet.getAge(), pet.getTrickLevel());
    }

    @Override
    public String toString() {
        return String.format("mother: %s; father: %s; children: %s; pet: $s",
                mother.getName(), father.getName(), Arrays.toString(children), pet.getSpecies());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }
}