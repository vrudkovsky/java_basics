package com.rudkovsky.family07;

import com.rudkovsky.family05.Pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children = new Human[0];
    private List<Human> childrenList = new ArrayList<>();
    private Pet pet = new Pet();


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        father.setFamily(this);
        mother.setFamily(this);

    }

    public Family(Human humanTest1, Human humanTest2, Human[] humans, com.rudkovsky.family07.Pet pet) {

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

    public void addChild(Human child) {
        Human[] tempArr = new Human[children.length + 1];
        System.arraycopy(children, 0, tempArr, 0, children.length);
        tempArr[tempArr.length - 1] = child;
        child.setFamily(this);
        children = tempArr;
    }

    public void addChildToList(Human child) {
        this.childrenList.add(child);
        child.setFamily(this);
    }

    public void deleteChild(int index) {
        if (index < 0 || index > this.children.length - 1) {
            return;
        }

        Human[] tempChildren = new Human[this.children.length - 1];

        for (int i = 0; i < children.length; i++) {
            if (i < index) {
                tempChildren[i] = this.children[i];
            } else if (i > index) {
                tempChildren[i - 1] = this.children[i];
            }
        }

        this.children = tempChildren;
    }

    public void deleteChild(Human childToDelete) {
        int index = -1;

        for (int i = 0; i < children.length; i++) {
            if (childToDelete.equals(children[i])) {
                index = i;
            }
        }

        deleteChild(index);
    }

    public void deleteChildFromList(int index) {
        if (index < 0 || index > this.childrenList.size() - 1) {
            return;
        }

        this.childrenList.remove(index);
    }

    public void deleteChildFromList(Human human) {
        boolean removed = this.childrenList.remove(human);
    }

    public byte countFamily(){
        int count = this.children.length + 2;
        System.out.println("Family size " + count + "persons");

        return 0;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
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
        System.out.println("Family{"
                            +"mother =" + mother
                            + ", father =" + father
                            + ", children =" + Arrays.toString(children)
                            + ", pet = " + pet
                            + '}');
    }
}
