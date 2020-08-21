package com.rudkovsky.family07;

import java.util.Arrays;

public class Dog extends Pet implements Foul {
    private Species species = Species.DOG;

    public Dog() {
    }

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }


    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public void foul() {
        System.out.println("Need to cover my tracks well ...");
    }

    @Override
    public void respond() {
        System.out.println("Hey! I'm " +super.getNickname() + ", your " + species);
    }

    @Override
    public String toString() {
        return  species + ": " + "{" +
                "species=" + species +
                ", nickname='" + super.getNickname() + '\'' +
                ", age=" + super.getAge() +
                ", trickLevel=" + super.getTrickLevel() +
                ", habits=" + Arrays.toString(super.getHabits()) +
                '}';
    }

}
