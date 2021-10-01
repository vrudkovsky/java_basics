package com.rudkovsky.family07.entities;

import java.util.Arrays;

public final class Woman extends Human {
    public Woman(String familyMember, String name, String surname, int year, int iq, Family family, String[][] schedule) {
        super(familyMember, name, surname, year, iq, family, schedule);
    }
    public void makeup(){
        System.out.println("Doing make-up now");
    }

    @Override
    public void greetPet() {
        super.greetPet();
        System.out.println("Hey sweety" + super.getFamily().getPet() + ". How are you, body?");
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
                ", pet = " + super.getFamily().getPet() +
                '}';
    }
}
