package entity;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Family {
    private Human mother;
    private Human father;
    private List<Object> children;
    private Set<Object> pet;


    public Family(Human mother, Human father, List<Object> children, Set<Object> pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
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

    public Set<Object> getPet() {
        return pet;
    }

    public void setPet(Set<Object> pet) {
        this.pet = pet;
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



    @Override
    public String toString() {
        return "Family --> {" +
                "mother: " + mother + "; " + '\n' +
                "father: " + father + "; " + '\n' +
                "children: " + children + "; " + '\n' +
                "pet=" + pet +  "; " + '\n' +
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
                            + ", pet = " + pet
                            + '}' + "destroyed" + '\n');
    }
}
