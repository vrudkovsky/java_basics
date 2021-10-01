package com.rudkovsky.family08.entities;

import com.rudkovsky.family08.Species;
import com.rudkovsky.family08.interfaces.Foul;

import java.util.Set;

public class DomesticCat extends Pet implements Foul {
    private Species species = Species.DOMESTICCAT;

    public DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }


    @Override
    public void respond() {
        System.out.println("Hello. I'm " + super.getNickname() + " your " + species);
    }

    @Override
    public void foul() {
        System.out.println("Need to cover my tracks well ...");
    }

    @Override
    public String toString() {
        return  species + ": " + "{" +
                "species=" + species +
                ", nickname='" + super.getNickname() + '\'' +
                ", age=" + super.getAge() +
                ", trickLevel=" + super.getTrickLevel() +
                ", habits=" + this.getHabits() +
                '}';
    }
}
