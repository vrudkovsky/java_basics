package com.rudkovsky.family12.exceptions;

public class FamilyOverflowException extends RuntimeException {
    private final int familiesCount;

    public FamilyOverflowException(int familiesCount) {
        super("Exceeding the number of family members: " + familiesCount);
        this.familiesCount = familiesCount;
    }

    public FamilyOverflowException(String message, int familiesCount) {
        super(message);
        this.familiesCount = familiesCount;
    }

    public int getFamilyCount() {
        return familiesCount;
    }

}
