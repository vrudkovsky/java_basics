package com.rudkovsky.family;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule = new String[7][1];

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

    public void greetPet() {
        System.out.printf("Hello %s!/n", pet.nickname);
    }

    public void describePet() {
        System.out.printf("I have a %s. He is %d years old and he is %s/n", pet.species, pet.age, pet.trickLevel);
    }

    @Override
    public String toString() {
        return String.format(
                "name: %s; surname: %s; year: %d; iq: %d; mother: %s; father: %s; pet: %s;",
                name, surname, year, iq, (mother != null)? mother.name : "no mother", (father != null)? father.name : "no father", pet);
    }
}