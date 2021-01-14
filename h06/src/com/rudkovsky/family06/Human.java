package com.rudkovsky.family06;

import java.util.Arrays;

public class Human {
    private String familyMember;
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String[][] schedule = new String[7][2];

    public Human() {
    };

    public Human(String familyMember, String name, String surname, int year) {
        this.familyMember = familyMember;
        this.name = name;
        this.surname = surname;
        this.year = year;
    };

    public Human(String familyMember, String name, String surname, int year, Family family) {
        this.familyMember = familyMember;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.family = family;
    };

    public Human(String familyMember, String name, String surname, int year, int iq, Family family) {
        this.familyMember = familyMember;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family = family;
    };

    public Human(String familyMember, String name, String surname, int year, int iq, Family family, String[][] schedule) {
        this.familyMember = familyMember;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family = family;
        this.schedule = schedule;
    };

    public String getFamilyMember() {
        return this.familyMember;
    };

    public void setFamilyMember(String familyMember) {
        this.familyMember = familyMember;
    };

    public String getName() {
        return this.name;
    };

    public void setName(String name) {
        this.name = name;
    };

    public String getSurname() {
        return this.surname;
    };

    public void setSurname(String surname) {
        this.surname = surname;
    };

    public int getYear() {
        return this.year;
    };

    public void setYear(int year) {
        this.year = year;
    };

    public int getIq() {
        return this.iq;
    };

    public void setIq(int iq) {
        this.iq = iq;
    };

    public Family getFamily() {
        return family;
    };

    public void setFamily(Family family) {
        this.family = family;
    };

    public String[][] getSchedule() {
        return schedule;
    };

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    };

    public void greetPet() {
        System.out.println("Hello " + family.getPet().getNickname());
    };

    public void describePet() {
        System.out.println("I have " + family.getPet().getSpecies() +
                ". He is name is " + family.getPet().getNickname() + " years old and he is " +
                ((family.getPet().getTrickLevel() > 50) ? "very tricky" : "almost tricky"));
    };

    public void feedPet() {
        System.out.println("Here is your food " + family.getPet().getNickname());
    };


    @Override
    public String toString() {
        String text = "";
        text += this.familyMember + " {" + "name = " + this.name  + ", "
                + "surname = " + this.surname + ", "
                + "year = " + this.year + ", "
                + "iq = " + this.iq + ", "
                + "schedule=" + Arrays.deepToString(schedule) + ", "
                + "}" + '\n';
        return text;
    };

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return year == human.year &&
                iq == human.iq &&
                name.equals(human.name) &&
                surname.equals(human.surname) &&
                Arrays.equals(schedule, human.schedule);
    }
}
