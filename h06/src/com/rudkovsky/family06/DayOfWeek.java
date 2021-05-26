package com.rudkovsky.family06;

public enum DayOfWeek {
    SUNDAY("sunday"),
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday");

    String name;

    DayOfWeek(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Day of the week are " + this.name().toLowerCase();
    }
}
