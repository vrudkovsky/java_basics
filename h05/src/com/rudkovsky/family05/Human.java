package com.rudkovsky.family05;

import java.util.Arrays;
import java.util.Optional;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, int year, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.family = family;
    }

    public Human(String name, String surname, int year, int iq, Family family) {
        this(name, surname, year, family);
        this.iq = iq;
    }

    public Human(String name, String surname, int year, int iq, Family family, String[][] schedule) {
        this(name, surname, year, iq, family);
        this.schedule = schedule;
    }

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

    private String process(Pet origin) {
        return Optional.ofNullable(origin)
                .map(s -> String.format("Hey %s!!!", s.getNickname()))
                .orElse(">> I don't have any pet <<");
    }

    public void greetPet() {
        System.out.println(process(this.family.getPet()));
    }

    public  void describePet() {
        System.out.printf("I have %s. It is %d years old. It is %s",
                this.family.getPet().getSpecies(),
                this.family.getPet().getAge(),
                (this.family.getPet().getTricklevel() > 50)? "tricky\n" : "almost tricky\n");
    }

    public boolean feedPet(boolean isFeed) {
        Randomizer r = new Randomizer();
        if (isFeed) {
            System.out.println("Let's feed him");
            return true;
        }else if (!isFeed && (this.family.getPet().getTricklevel() > r.randomizer_0to100())) {
            System.out.println("Let's feed him");
            return true;
        } else {
            System.out.println("He doesn't want to eat");
            return false;
        }


    }

    @Override
    public String toString() {
        String text = "";
        text += "Human {" + "name = " + this.name  + ", "
                + "surname = " + this.surname + ", "
                + "year = " + this.year + ", "
                + "iq = " + this.iq
                + "schedule=" + Arrays.toString(this.schedule)
                + "}" + '\n';
        return text;
    }
}