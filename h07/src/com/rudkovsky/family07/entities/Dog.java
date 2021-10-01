package com.rudkovsky.family07.entities;

import com.rudkovsky.family07.enums.Species;
import com.rudkovsky.family07.interfaces.Foul;

import java.util.Arrays;

public class Dog extends Pet implements Foul {
    private final Species species = Species.DOG;

    public Dog(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    public Species getSpecies() {
        return species;
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
                ", nickname='" + super.getNickname() + '\'' +
                ", age=" + super.getAge() +
                ", trickLevel=" + super.getTrickLevel() +
                ", habits=" + Arrays.toString(super.getHabits()) +
                '}';
    }
}
