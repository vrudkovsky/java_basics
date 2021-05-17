package com.rudkovsky.family;

import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits = new String[5];

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

    public Pet() {
    }

    public void eat() {
        System.out.println("I'm eating");
    }

    public void respond() {
        System.out.println("Hello master. I'm " + nickname + ". I missed you!");
    }

    public void foul() {
        System.out.println("I have to cover it all");
    }

    @Override
    public String toString() {
        return String.format(nickname, age, trickLevel, Arrays.toString(habits));
    }
}