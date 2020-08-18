package com.rudkovsky.family07;

public enum Species {
    CAT,
    DOG,
    FISH,
    PARROT;

    @Override
    public String toString() {
        return "Species is " + this.name().toLowerCase();
    }
}


