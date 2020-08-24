package com.rudkovsky.family10.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Map<String, String> schedule = new HashMap<>();
    private com.rudkovsky.family10.entity.Pet pet;
    private com.rudkovsky.family10.entity.Family family;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq) {
        this(name, surname, year);
        this.iq = iq;
    }

    public Human(String name, String surname, int year, int iq, com.rudkovsky.family10.entity.Pet pet) {
        this(name, surname, year, iq);
        this.pet = pet;
    }

    public Human(String name, String surname, int year, int iq, com.rudkovsky.family10.entity.Pet pet, Map<String, String> schedule) {
        this(name,surname, year, iq, pet);
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, int iq, Map<String, String> schedule1) {

    }

    void greetPet() {
        System.out.println("Hello " + this.pet.getNickname());
    }

    void describePet() {
        System.out.println("I have " + this.pet.getNickname() + "His is " + this.pet.getAge() + " years old");
        if (this.pet.getTrickLevel() >= 50) {
            System.out.print("He is very tricky");
            System.out.print('\n');
        } else {
            System.out.print("He is almost tricky");
            System.out.print('\n');
        }
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

    public Map<String, String> getSchedule() {
        schedule.put(String.valueOf(com.rudkovsky.family10.entity.DayOfWeek.MONDAY), null);
        schedule.put(String.valueOf(com.rudkovsky.family10.entity.DayOfWeek.TUESDAY), null);
        schedule.put(String.valueOf(com.rudkovsky.family10.entity.DayOfWeek.WEDNESDAY), null);
        schedule.put(String.valueOf(com.rudkovsky.family10.entity.DayOfWeek.THURSDAY), null);
        schedule.put(String.valueOf(com.rudkovsky.family10.entity.DayOfWeek.FRIDAY), null);
        schedule.put(String.valueOf(com.rudkovsky.family10.entity.DayOfWeek.SATURDAY), null);
        schedule.put(String.valueOf(DayOfWeek.SUNDAY), null);

        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public com.rudkovsky.family10.entity.Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public com.rudkovsky.family10.entity.Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return  "Human {" + "name = " + this.name  + ", "
                + "surname = " + this.surname + ", "
                + "year = " + this.year + ", "
                + "iq = " + this.iq + ", "
                + "schedule = " + schedule
                + "}" + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year &&
                iq == human.iq &&
                name.equals(human.name) &&
                surname.equals(human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, family);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(
                        "Human: {" + "name = " + this.name  + ", "
                        + "surname = " + this.surname + ", "
                        + "year = " + this.year + ", "
                        + "iq = " + this.iq + ", "
                        + "schedule = " + schedule
                        + "}"+ "destroyed" + '\n');
    }
}
