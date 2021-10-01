package com.rudkovsky.family07.enums;

public enum DayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    @Override
    public String toString() {
        return "Days of the week are " + this.name().toLowerCase();
    }
}
