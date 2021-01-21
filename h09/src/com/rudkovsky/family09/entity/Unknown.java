package com.rudkovsky.family09.entity;


import java.util.Set;

public class Unknown extends Pet {
    public Species species = Species.UNKNOWN;

    public Unknown(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hey! I'm " + super.getNickname() + ", your " + species);
    }

    @Override
    public String toString() {
        return "Unknown7{" +
                "species7=" + species +
                ", nickname='" + super.getNickname() + '\'' +
                ", age=" + super.getAge() +
                ", trickLevel=" + super.getTrickLevel() +
                ", habits=" + habits+
                '}';
    }
}
