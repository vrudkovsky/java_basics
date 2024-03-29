package com.rudkovsky.family12.entity.pet;

import com.rudkovsky.family12.entity.enums.Species;

import java.util.Set;

public class Dog extends Pet implements Foul {
    private Species species = Species.DOG;

    public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
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
                ", habits=" + habits +
                '}';
    }

}
