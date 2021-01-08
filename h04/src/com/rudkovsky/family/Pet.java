package com.rudkovsky.family;

import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    public Pet() {
    };

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    };

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    };

    public void eat() {
        System.out.println("I'm eating.");
    };
    public void respond() {
        System.out.println("Hello master. I'm " + nickname + ". I'm missing you!");
    };
    public void foul() {
        System.out.println("I have to everything clean up here");
    };

    @Override
    public String toString() {
        return this.species + "; " +
                "nickname=" + this.nickname + "; " +
                "age=" + this.age + "; " +
                "trickLevel=" + this.trickLevel + "; " +
                "habits=" + Arrays.toString(this.habits);
    };
}
