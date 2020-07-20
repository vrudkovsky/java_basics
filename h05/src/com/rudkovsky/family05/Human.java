package com.rudkovsky.family05;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father ;
    private String[][] schedule = new String[7][2];
    private Family family;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Human mother, Human father) {
        this(name, surname, year);
        this.iq = iq;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        this(name, surname, year, iq, mother, father);
        this.pet = pet;
//        this.describePet();
    }

//    void greetPet() {
//        System.out.println("Hello " + this.pet.nickname);
//    }
//
//    void describePet() {
//        System.out.println("I have " + this.pet.nickname + "His is " + this.pet.age + " years old");
//        if (pet.trickLevel >= 50) {
//            System.out.print("He is very tricky");
//            System.out.print('\n');
//        } else {
//            System.out.print("He is almost tricky");
//            System.out.print('\n');
//        }
//    }

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
            text += "\tpet= " + this.pet + "}";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year &&
                iq == human.iq &&
                name.equals(human.name) &&
                surname.equals(human.surname) &&
                pet.equals(human.pet) &&
                mother.equals(human.mother) &&
                father.equals(human.father) &&
                Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, pet, mother, father);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }
}
