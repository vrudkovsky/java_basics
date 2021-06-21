package com.rudkovsky.family;

import java.util.Optional;

public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;
    public Human mother;
    public Human father;
    public  String[][] schedule = new String[7][1];

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human() {
    }

    private String process(Pet origin) {
        return Optional.ofNullable(origin)
                .map(s -> String.format("Hey %s!!!", s.nickname))
                .orElse(">> I don't have any pet <<");
    }

    public void greetPet() {

        System.out.println(process(pet));
    }

    public  void describePet() {
        System.out.printf("I have %s. It is %d years old. It is %s",
                pet.species,
                pet.age,
                (pet.tricklevel > 50)? "tricky\n" : "almost tricky\n");
    }

    public void feedPet() {
        System.out.println("I'm eating");
    }

    @Override
    public String toString() {
        String text = "";
        text += "Human {" + "name = " + this.name  + ", "
                + "surname = " + this.surname + ", "
                + "year = " + this.year + ", "
                + "iq = " + this.iq
                + "}" + '\n';
        if(this.mother != null)
            text += "\tmother= " + this.mother.name + ", " + this.mother.surname;
        if(this.father != null)
            text += ", father= " + this.father.name + ", " + this.father.surname + "}" + '\n';
        if(this.pet != null)
            text += "\tpet=" + this.pet + "}";
        return text;
    }
}
