package com.rudkovsky.family10.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Map<String, String> schedule = new HashMap<>();
    private com.rudkovsky.family10.entity.Pet pet;
    private com.rudkovsky.family10.entity.Family family;

    public Human(String name, String surname, long birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Human(String name, String surname, long birthDate, int iq) {
        this(name, surname, birthDate);
        this.iq = iq;
    }

    public Human(String name, String surname, long birthDate, int iq, com.rudkovsky.family10.entity.Pet pet) {
        this(name, surname, birthDate, iq);
        this.pet = pet;
    }

    public Human(String name, String surname, long birthDate, int iq, com.rudkovsky.family10.entity.Pet pet, Map<String, String> schedule) {
        this(name,surname, birthDate, iq, pet);
        this.schedule = schedule;
    }

    public Human(String name, String surname, String birthDay, int iq) throws ParseException {
        this.name = name;
        this.surname = surname;
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(birthDay);
        this.birthDate = date.getTime();
    }

    public Human(String name, String surname, long birthDate, int iq, Map<String, String> schedule, com.rudkovsky.family10.entity.Pet pet, com.rudkovsky.family10.entity.Family family) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
        this.schedule = schedule;
        this.pet = pet;
        this.family = family;
    }

    protected void greetPet() {
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

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<String, String> getSchedule() {
        schedule.put(String.valueOf(DayOfWeek.MONDAY), null);
        schedule.put(String.valueOf(DayOfWeek.TUESDAY), null);
        schedule.put(String.valueOf(DayOfWeek.WEDNESDAY), null);
        schedule.put(String.valueOf(DayOfWeek.THURSDAY), null);
        schedule.put(String.valueOf(DayOfWeek.FRIDAY), null);
        schedule.put(String.valueOf(DayOfWeek.SATURDAY), null);
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

    public String describeAge() {
        LocalDate birthDate = Instant.ofEpochMilli(this.birthDate).atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currDate = Instant.ofEpochMilli(new Date().getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
        Period period = Period.between(birthDate, currDate);
        return period.getDays() + "- days " + period.getMonths() + "-month " + period.getYears() + "-years ";
    }

    public String BirthDateFormat() {
        Date date = new Date(this.birthDate);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(date);
    }

    @Override
    public String toString() {
        return  "Human {" + "name = " + this.name  + ", "
                + "surname = " + this.surname + ", "
                + "Birth Day = " + this.birthDate + ", "
                + "iq = " + this.iq + ", "
                + "schedule = " + schedule
                + "}" + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthDate == human.birthDate &&
                iq == human.iq &&
                name.equals(human.name) &&
                surname.equals(human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, family);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(
                        "Human: {" + "name = " + this.name  + ", "
                        + "surname = " + this.surname + ", "
                        + "year = " + this.BirthDateFormat() + ", "
                        + "iq = " + this.iq + ", "
                        + "schedule = " + schedule
                        + "}"+ "destroyed" + '\n');
    }
}
