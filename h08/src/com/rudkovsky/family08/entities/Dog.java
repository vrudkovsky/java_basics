package com.rudkovsky.family08.entities;

import com.rudkovsky.family08.Species;
import com.rudkovsky.family08.interfaces.Foul;

import java.util.Set;

public class Dog extends Pet implements Foul {
    private Species species = Species.DOG;

    public Dog(Species dog, String nickname, int age, int trickLevel, Set<String> habits) {
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
        System.out.println("Hey! I'm " + super.getNickname() + ", your " + species);
    }

    @Override
    public String toString() {
        return  species + ": " + "{" +
                "species=" + species +
                ", nickname='" + this.getNickname() + '\'' +
                ", age=" + this.getAge() +
                ", trickLevel=" + this.getTrickLevel() +
                ", habits=" + this.getHabits() +
                '}';
    }
}
