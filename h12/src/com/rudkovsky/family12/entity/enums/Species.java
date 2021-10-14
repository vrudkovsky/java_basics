package com.rudkovsky.family12.entity.enums;

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


