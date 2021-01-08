package com.rudkovsky.family;

public class Human {
    String familyMember;
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule = new String[7][1];

    public Human() {
    };

    public Human(String familyMember, String name, String surname, int year) {
        this.familyMember = familyMember;
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String familyMember, String name, String surname, int year, Human mother, Human father) {
        this.familyMember = familyMember;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String familyMember, String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        this.familyMember = familyMember;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Human(String familyMember, String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.familyMember = familyMember;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello " + pet.nickname);
    };

    public void describePet() {
        System.out.println("I have " + pet.species +
                            ". He is " + pet.age + " years old and " +
                            ((pet.trickLevel > 50) ? "very tricky" : "almost tricky"));
    };


    @Override
    public String toString() {
        String text = "";
        text += this.familyMember + " {" + "name = " + this.name  + ", "
                + "surname = " + this.surname + ", "
                + "year = " + this.year + ", "
                + "iq = " + this.iq
                + "}" + '\n';
        if(this.mother != null)
            text += "\tmother= " + this.mother.name + " " + this.mother.surname;
        if(this.father != null)
            text += ", father= " + this.father.name + " " + this.father.surname + "}" + '\n';
        if(this.pet != null)
            text += "\tpet=" + "{" + this.pet + "}";
        return text;
    };
}
