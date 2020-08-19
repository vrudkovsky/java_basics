package com.rudkovsky.family08;

import java.util.Arrays;

public class Man extends Human {
    public Man(String name, String surname, int year, int iq, Pet pet, String[][] schedule) {
        super(name, surname, year, iq, pet, schedule);
    }

    public void repairCar(){
        System.out.println("I have to fix my car now");
    }

    @Override
    void greetPet() {
        super.greetPet();
        System.out.println("Hey " + super.getPet() + ". How are you, body");
    }

    @Override
    public String toString() {
        return  this + "{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", year=" + super.getYear() +
                ", iq=" + super.getIq() +
                ", schedule=" + Arrays.deepToString(super.getSchedule()) +
                ", family=" + super.getFamily() +
                ", pet=" + super.getPet() +
                '}';
    }
}
