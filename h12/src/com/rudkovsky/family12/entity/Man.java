package com.rudkovsky.family12.entity;

import java.util.HashMap;

public class Man extends Human {
    public Man(String name, String surname, long birthDate, int iq) {
        super(name, surname, birthDate, iq);
    }

    public Man(String name, String surname, long birthDate, int iq, Pet pet) {
        super(name, surname, birthDate, iq, pet);
    }

    public Man(String name, String surname, long birthDate, int iq, Pet pet, HashMap<String, String> schedule) {
        super(name, surname, birthDate, iq, pet, schedule);
    }

    public void repairCar(){
        System.out.println("I have to fix my car now");
    }



    @Override
    void greetPet() {
        super.greetPet();
    }

    @Override
    public String toString() {
        return  "Man: {" +
                "name = " + this.getName() + "; " +
                "surname = " + getSurname() + "; " +
                "year = " + getBirthDate() + "; " +
                "iq = " + getIq() + "; \n" +
                "schedule = " + getSchedule() + "; \n" +
                "family = " + getFamily() + "; \n" +
                "pet = " + getPet() +
                '}';
    }

}
