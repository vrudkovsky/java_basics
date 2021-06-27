package com.rudkovsky.family05;

public class Main {
    public static void main(String[] args) {
        //first family
        Family family = new Family();
        family.setFather(new Human("Alex" , "Freeman", 1977, family));
        family.setMother(new Human("Sarah", "Freeman", 1980, family));
        family.addChild(new Human("Max", "Freeman", 2000, family));
        family.addChild(new Human("Sergii", "Freeman", 2003, family));
        family.addChild(new Human("Anton", "Freeman", 2005, family));
        family.addChild(new Human("Helen", "Freeman", 2007, family));
        family.addChild(new Human("Ira", "Freeman", 2010, family));
        Pet pet = new Pet("dog", "Jasper", 4, 75, new String[] {"Eat", "Walk", "Sleep"});


//        family1.describePet();
        System.out.println(family);

    }
}