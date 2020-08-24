package com.rudkovsky.family10.entity;

import java.util.Set;

public class RoboCat extends Pet implements Foul {
    public com.rudkovsky.family10.entity.Species species = Species.ROBOCAT;

    public RoboCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
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
                ", habits=" + habits +
                '}';
    }

    @Override
    public void foul() {
        System.out.println("Need to cover my tracks well ...");
    }
}
