package com.rudkovsky.family05;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String[][] schedule = new String[7][1];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.family = family;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Family family, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human() {
    }


    @Override
    public String toString() {
        return String.format(
                "name: %s; surname: %s; year: %d; iq: %d; family: $s;",
                name, surname, year, iq, family);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq);
    }
}