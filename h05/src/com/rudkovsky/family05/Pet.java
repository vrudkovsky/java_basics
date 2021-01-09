package com.rudkovsky.family05;

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


    public String getSpecies() {
        return this.species;
    }


    public void setSpecies(String species) {
        this.species = species;
    }


    public String getNickname() {
        return this.nickname;
    }


    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public int getAge() {
        return this.age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public int getTrickLevel() {
        return this.trickLevel;
    }


    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }


    public String[] getHabits() {
        return habits;
    }


    public void setHabits(String[] habits) {
        this.habits = habits;
    }


    public void eat() {
        System.out.println("I'm eating.");
    }


    public void respond() {
        System.out.println("Hello master. I'm " + nickname + ". I'm missing you!");
    }


    public void foul() {
        System.out.println("I have to everything clean up here");
    }


    @Override
    public String toString() {
        return "species=" + this.species + "; " +
                "nickname=" + this.getNickname() + "; " +
                "age=" + this.getAge() + "; " +
                "trickLevel=" + this.getTrickLevel() + "; " +
                "habits=" + Arrays.toString(this.getHabits());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pet pet = (Pet) obj;
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
