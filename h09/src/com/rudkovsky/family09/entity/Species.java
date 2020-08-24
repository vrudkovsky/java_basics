package com.rudkovsky.family09.entity;

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


