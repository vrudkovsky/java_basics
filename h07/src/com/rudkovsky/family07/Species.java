package com.rudkovsky.family07;

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
