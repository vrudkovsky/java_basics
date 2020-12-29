package com.rudkovsky.family09.entity;

import com.rudkovsky.family10.entity.Human;
import com.rudkovsky.family10.entity.Pet;

import java.util.HashMap;

public class Man extends Human {
    public Man(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Man(String name, String surname, int year, int iq, Pet pet) {
        super(name, surname, year, iq, pet);
    }

    public Man(String name, String surname, int year, int iq, Pet pet, HashMap<String, String> schedule) {
        super(name, surname, year, iq, pet, schedule);
    }

    public void repairCar(){
        System.out.println("I have to fix my car now");
    }

    @Override
    protected void greetPet() {
        super.greetPet();
    }

    @Override
    public String toString() {
        return  "Man: {" +
                "name = " + this.getName() + "; " +
                "surname = " + getSurname() + "; " +
//                "year = " + getYear() + "; " +
                "iq = " + getIq() + "; \n" +
                "schedule = " + getSchedule() + "; \n" +
                "family = " + getFamily() + "; \n" +
                "pet = " + getPet() +
                '}';
    }
}
