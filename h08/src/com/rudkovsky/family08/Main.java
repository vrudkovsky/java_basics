package com.rudkovsky.family08;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Set review
        // Dog class constructors
        Dog dog = new Dog("Jeck", 5, 50, new HashSet<>());
        dog.habits.add("run");
        dog.habits.add("dance");
        System.out.println(dog);
        System.out.println('\0');

        // Cat class constructors
        DomesticCat cat = new DomesticCat("Max", 5, 70, new HashSet<>());
        dog.habits.add("run");
        dog.habits.add("dance");
        System.out.println(dog);
        System.out.println('\0');

        // Fish class constructor
        Fish fish = new Fish("Nemo", 1, 50, new HashSet<>() );
        fish.habits.add("swimming");
        fish.habits.add("having fun");
        System.out.println(fish);
        System.out.println("---------------");

        // Map review
        // Man
        Map<String, String> schedule = new HashMap<>();
        Man man = new Man("Homes", "Addams", 1977,125, dog, new HashMap<>());
        man.setSchedule(schedule);
        man.greetPet();
        man.repairCar();
        man.getSchedule().put(String.valueOf(DayOfWeek.FRIDAY), "go to work");
        System.out.println("Man schedule: " + schedule);
        System.out.println("---------------");

        // Family review
        // Man - father
        Man father = new Man("Homes", "Addams", 1977, 90, cat);

        //Woman - mother
        Woman mother = new Woman("Morticia", "Addams", 1979, 124, dog);

        //Children
        Man son = new Man("Pugsley", "Addams", 1995, 90);
        Woman daughter = new Woman("Wednesday", "Addams", 1989, 110);

        //Family
        Family family = new Family(mother,father, new ArrayList<>(), new HashSet<>());
        family.addChild(son);
        family.addChild(daughter);
        System.out.println(family);

    }
}
