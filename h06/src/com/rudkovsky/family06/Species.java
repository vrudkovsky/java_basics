package com.rudkovsky.family06;

public enum Species {
    CAT("cat"),
    DOG("dog"),
    FISH("fish"),
    PARROT("parrot");

    String name;

    Species(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Species is " + this.name().toLowerCase();
    }
}
