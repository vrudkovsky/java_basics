package com.rudkovsky.family08;

import java.util.Arrays;

public class Fish extends Pet {
    private Species species = Species.FISH;

    public  Fish(String name, int age, int trickLevel, String[] habbits) {
        super(name, age, trickLevel, habbits);
    }

    public Fish() {
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public void respond() {
        System.out.println("Hello. I'm " + super.getNickname() + " your fish.");
    }

    @Override
    public String toString() {
        return  species + "{" +
                "species=" + species +
                ", nickname='" + super.getNickname() + '\'' +
                ", age=" + super.getAge() +
                ", trickLevel=" + super.getTrickLevel() +
                ", habits=" + Arrays.toString(super.getHabits()) +
                '}';
    }
}
