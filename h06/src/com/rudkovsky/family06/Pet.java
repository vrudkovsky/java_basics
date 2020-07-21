package com.rudkovsky.family06;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

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

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                species.equals(pet.species) &&
                nickname.equals(pet.nickname) &&
                Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }
}
