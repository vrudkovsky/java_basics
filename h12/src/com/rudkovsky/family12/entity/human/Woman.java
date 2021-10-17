package com.rudkovsky.family12.entity.human;

import com.rudkovsky.family12.entity.pet.Pet;

import java.text.ParseException;
import java.util.HashMap;

public class Woman extends Human {
    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Woman(String name, String surname, int year, int iq, Pet pet) {
        super(name, surname, year, iq, pet);
    }

    public Woman(String name, String surname, int year, int iq, Pet pet, HashMap<String, String[]> schedule) {
        super(name, surname, year, iq, pet, schedule);
    }

    public Woman(String motherName, String motherSurname, String motherBirth, Integer motherIq) throws ParseException {
        super(motherName, motherSurname, motherBirth, motherIq);
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

    private String getYear() {
        return null;
    }
}
