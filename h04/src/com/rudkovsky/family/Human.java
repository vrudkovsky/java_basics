package com.rudkovsky.family;

public class Human {
    String name;
    String surname;
    int year;
    int iq;

    Pet pet = new Pet();
    Human mother = new Human();
    Human father = new Human();
    String[][] schedule = new String[7][2];

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this(name, surname, year);
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this(name, surname, year, mother, father);
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
    }

    void greetPet(String nickname) {
        System.out.println("Hello " + nickname);
    }

    void describePet(String nickname, int age, int trickLevel) {
        System.out.println("I have " + nickname + "His is " + age + " years old");
        if (trickLevel > 50) {
            System.out.print("He is very tricky");
            System.out.print('\n');
        } else {
            System.out.print("He is almost tricky");
            System.out.print('\n');
        }
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name
                + "surname=" + surname + ", "
                + "year=" + year + ", "
                + "iq=" + iq + ", "
                + "mother=" + mother.name + ", "
                + "father=" + father.name + ", "
                + "pet=" + "dog{" + pet.nickname + ", "
                + "age=" + pet.age + ", "
                + "trickLevel=" + pet.trickLevel + ", "
                + "habits=" + pet.habits
                + "}"  + ", " + "}";
    }
}
