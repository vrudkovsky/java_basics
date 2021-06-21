package com.rudkovsky.family;

import java.util.Arrays;

public class Pet {
    public String species;
    public String nickname;
    public int age;
    public int tricklevel;
    String [] habits;

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int tricklevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }

    public Pet() {
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
