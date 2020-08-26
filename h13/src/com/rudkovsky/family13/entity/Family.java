package com.rudkovsky.family13.entity;

import java.util.List;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private List<Object> children;
    public List<Pet> pets;


    public Family() {
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, List<Object> children, List<Pet> pets) {
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

    public List<Pet> getPets() {
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

    public String prettyFormat() {
        StringBuilder formatedStr = new StringBuilder();

        formatedStr.append("family: ").append('\n');

        if (this.mother != null) {
            formatedStr.append('\t')
                    .append("mother: ")
                    .append(this.mother.prettyFormat())
                    .append(",")
                    .append('\n');
        }
        if (this.father != null) {
           formatedStr.append('\t')
                    .append("mother: ")
                    .append(this.father.prettyFormat())
                    .append(",")
                    .append('\n');
        }
        if (this.children.size() > 0) {
            formatedStr.append('\t')
                    .append("children: ")
                    .append('\n');
            Human child = null;
            for (int i = 0; i < this.children.size(); i++) {
                String childType = child instanceof Man ? "boy" : "girl";
                formatedStr.append('\t')
                        .append('\t')
                        .append('\t')
                        .append(childType)
                        .append(child.prettyFormat())
                        .append('\n');
            }
            formatedStr.append('\t')
                    .append("pets: [");
            for (Pet pet: pets) {
                formatedStr.append("{")
                        .append(pet.prettyFormat())
                        .append("},");
            }
            if (this.pets.size() > 0) {
                formatedStr.deleteCharAt(formatedStr.length() - 1);
            }
            formatedStr.append("]");
        }

        return formatedStr.toString();
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
