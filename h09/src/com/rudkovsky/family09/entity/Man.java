package com.rudkovsky.family09.entity;

import java.util.Arrays;
import java.util.Map;

public final class Man extends Human {
    public Man(String familyMember, String name, String surname, int year, int iq, Family family, Map<String, String> schedule) {
        super(familyMember, name, surname, year, iq, family, schedule);
    }
    public void repairCar(){
        System.out.println("I have to fix my car now");
    }

    @Override
    public void greetPet() {
        System.out.println("Hey " + super.getFamily().getPet() + ". How are you, body");
    }

    @Override
    public String toString() {
        return  this + "{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", year=" + super.getYear() +
                ", iq=" + super.getIq() +
                ", schedule=" + this.getSchedule() +
                ", family=" + super.getFamily() +
                ", pet=" + super.getFamily().getPet() +
                '}';
    }
}
