package com.rudkovsky.family07.entities;

import com.rudkovsky.family07.enums.Species;
import com.rudkovsky.family07.interfaces.Foul;

import java.util.Arrays;

public class DomesticCat extends Pet implements Foul {
    private Species species = Species.DOMESTICCAT;

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
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
                ", habits=" + Arrays.toString(super.getHabits()) +
                '}';
    }
}
