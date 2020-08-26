package com.rudkovsky.family13.entity;

public enum Species {
    DOMESTICCAT,
    DOG,
    FISH,
    ROBOCAT,
    UNKNOWN;

    @Override
    public String toString() {
        return "Species is " + this.name().toLowerCase();
    }
}


