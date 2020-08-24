package com.rudkovsky.family10.entity;

import java.util.HashMap;

public class Woman extends Human {
    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Woman(String name, String surname, int year, int iq, com.rudkovsky.family10.entity.Pet pet) {
        super(name, surname, year, iq, pet);
    }

    public Woman(String name, String surname, int year, int iq, Pet pet, HashMap<String, String> schedule) {
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
        return  "Woman: {" +
                "name = " + this.getName() + "; " +
                "surname = " + this.getSurname() + "; " +
                "year = " + this.getYear() + "; " +
                "iq = " + this.getIq() + "; \n" +
                "schedule = " + this.getSchedule() + "; \n" +
                "family = " + this.getFamily() + "; \n" +
                "pet = " + this.getPet() +
                '}';
    }
}
