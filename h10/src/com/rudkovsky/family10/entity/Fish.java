package com.rudkovsky.family10.entity;

import java.util.Set;

public class Fish extends Pet {
    private com.rudkovsky.family10.entity.Species species = com.rudkovsky.family10.entity.Species.FISH;

     public  Fish(String name, int age, int trickLevel, Set<String> habbits) {
        super(name, age, trickLevel, habbits);
    }


    public com.rudkovsky.family10.entity.Species getSpecies() {
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
                ", habits=" + habits +
                '}';
    }
}
