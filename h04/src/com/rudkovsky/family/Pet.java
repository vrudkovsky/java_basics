package com.rudkovsky.family;

import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    public Pet() {
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    void eat() {
        System.out.println(this.species + ": " + "I am eating");
    }

    void respond() {
        System.out.println("Hello master. I am "
                + this.species + ", "
                + this.nickname
                + ". I am missing you!" );
    }

    void foul() {
        System.out.println(this.species + ": " + "Need to cover my tracks well ...");
    }

    @Override
    public String toString() {
        return 	this.species
                + " {"
                + "nickname = " + this.nickname + ", "
                + "age = " + this.age + ", "
                + "trickLevel = " + trickLevel + ", \n"
                + "\thabits = " + Arrays.toString(habits)
                + "}";
    }
}
