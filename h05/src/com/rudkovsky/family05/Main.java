package com.rudkovsky.family05;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Pet class constructor
        String[] dogHabits = {"woofing", "defence house", "having walk"};
        Pet dog = new Pet("dog", "Max", 3, 60, dogHabits);
        //Checking pet's methods
//        System.out.println(dog.getNickname());
//        System.out.println(dog.getAge());
//        dog.eat();
//        dog.respond();
//        dog.foul();

        //Creating Family
        Human father = new Human("father", "Homes", "Addams", 1977);
        Human mother = new Human("mother", "Morticia", "Addams", 1979);
        Family addams = new Family(mother,father);
        //children born
        Human daughter = new Human("daughter","Wednesday", "Addams", 1989, 110, addams);
        Human son = new Human("son", "Pugsley", "Addams", 1995, 90, addams);
        //add children to the family
        addams.addChild(daughter);
        addams.addChild(son);
        //init father schedule
        String[][] fatherSchedule = new String[][]{
            { "sunday", "get to work", "go home" },
            { "monday", "fitness club", "running" },
            { "Wednesday", "watching TV", "dinner" }
        };
        father.setSchedule(fatherSchedule);
        //init mother schedule
        String[][] motherSchedule = new String[][]{
                { "sunday", "cleaning", "walking" },
                { "monday", "cooking", "washing" },
                { "Wednesday", "cinema", "take a rest" }
        };
        mother.setSchedule(motherSchedule);
        //init daughter schedule
        String[][] daughterSchedule = new String[][]{
                { "sunday", "cleaning", "walking" },
                { "monday", "cooking", "washing" },
                { "Wednesday", "cinema", "take a rest" }
        };
        daughter.setSchedule(daughterSchedule);
        //init son schedule
        String[][] sonSchedule = new String[][]{
                { "sunday", "cleaning", "walking" },
                { "monday", "cooking", "washing" },
                { "Wednesday", "cinema", "take a rest" }
        };
        son.setSchedule(sonSchedule);
        //add pet to the family initialised above
        addams.setPet(dog);

        //checking functionality of the Addams Family
        //Describe all family
        System.out.println("<-- Members of Addams family -->");
        System.out.println(addams.toString());
        System.out.println("<-- **** -->");
        //
        father.describePet();
        father.greetPet();
        father.feedPet();
        //
        System.out.println(Arrays.toString(addams.getPet().getHabits()));
        daughter.describePet();
        son.describePet();
        //Get all family members
        System.out.println("<--  Number of family members: -->");
        System.out.println(addams.countFamily());
        System.out.println("<-- Father -->");
        System.out.println(addams.getFather());
        System.out.println("<-- Mother -->");
        System.out.println(addams.getMother());
        System.out.println("<-- Children -->");
        System.out.println(Arrays.toString(addams.getChildren()));
        System.out.println("<-- Pet -->");
        System.out.println(addams.getPet());
        //
        System.out.println("<-- ****** -->");
        System.out.println("Get first child in the family");
        System.out.println(addams.getChildren()[0]);
        System.out.println("Get schedule of the first child");
        System.out.println(Arrays.deepToString(addams.getChildren()[0].getSchedule()));
        //
        System.out.println("<-- ****** -->");
        System.out.println("Get second child in the family");
        System.out.println(addams.getChildren()[1]);
        System.out.println("Get schedule of the second child");
        System.out.println(Arrays.deepToString(addams.getChildren()[1].getSchedule()));
    }
}