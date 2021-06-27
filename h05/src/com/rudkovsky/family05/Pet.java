package com.rudkovsky.family05;

import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int tricklevel;
    String [] habits;

    public Pet() {
    }

    public Pet(String species, String nickname, int age) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
    }

    public Pet(String species, String nickname, int age, int tricklevel) {
        this(species, nickname, age);
        this.tricklevel = tricklevel;
    }

    public Pet(String species, String nickname, int age, int tricklevel, String[] habits) {
        this(species, nickname, age, tricklevel);
        this.habits = habits;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTricklevel() {
        return tricklevel;
    }

    public void setTricklevel(int tricklevel) {
        this.tricklevel = tricklevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I'm eating");
    }

    public void respond() {
        System.out.printf("Hey, master! I'm %s. I'm niss you!\n", this.nickname);
    }

    public void foul() {
        System.out.println("I have to cover my traces");
    }

    @Override
    public String toString() {
        return String.format("%s{nickname '%s', age=%d, trickLevel=%d, habits=%s}\n", this.species, this.nickname, this.age, this.tricklevel, Arrays.toString(this.habits) );
    }
}
