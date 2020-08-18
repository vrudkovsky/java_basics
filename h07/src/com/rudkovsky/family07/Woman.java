package com.rudkovsky.family07;

import java.util.Arrays;

public class Woman extends  Human {
    public Woman(String name, String surname, int year, int iq, Pet pet, String[][] schedule) {
        super(name, surname, year, iq, pet, schedule);
    }

    public void makeup(){
        System.out.println("Doing make-up now");
    }

    @Override
    void greetPet() {
        super.greetPet();
        System.out.println("Hey sweety" + super.getPet() + ". How are you, body?");
    }

    @Override
    public String toString() {
        return  this + "{" +
                "name ='" + super.getName() + '\'' +
                ", surname = '" + super.getSurname() + '\'' +
                ", year = " + super.getYear() +
                ", iq = " + super.getIq() +
                ", schedule = " + Arrays.deepToString(super.getSchedule()) +
                ", family = " + super.getFamily() +
                ", pet = " + super.getPet() +
                '}';
    }
}
