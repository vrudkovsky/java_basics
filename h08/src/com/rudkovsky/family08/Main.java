package com.rudkovsky.family08;

import com.rudkovsky.family08.entities.Family;
import com.rudkovsky.family08.entities.Human;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Pet class constructor


        //Days of the week
        DayOfWeek sanday = DayOfWeek.SUNDAY;
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek thuesday = DayOfWeek.TUESDAY;
        DayOfWeek wednesday = DayOfWeek.WEDNESDAY;
        DayOfWeek thursday = DayOfWeek.THURSDAY;
        DayOfWeek friday = DayOfWeek.FRIDAY;
        DayOfWeek saturday = DayOfWeek.SATURDAY;

        //Creating Family
        Human father = new Human("father", "Homes", "Addams", 1977);
        Human mother = new Human("mother", "Morticia", "Addams", 1979);
        Family addams = new Family(mother,father);
//        addams.setPet((dog));
        //children born
        Human daughter = new Human("daughter","Wednesday", "Addams", 1989, 110, addams);
        Human son = new Human("son", "Pugsley", "Addams", 1995, 90, addams);
        //add children to the family
        addams.addChild(daughter);
        addams.addChild(son);

        //init father schedule
        Map<String, String[]> fatherSchedule = new HashMap<>() {{
            put(sanday.name(), new String[]{"get to work", "go home"});
            put(monday.name(), new String[]{"fitness club", "running"});
            put(wednesday.name(), new String[]{"watching TV", "dinner"});
        }};
        father.setSchedule(fatherSchedule);

        //init mother schedule
        Map<String, String[]> motherSchedule = new HashMap<>() {{
            put(sanday.name(), new String[]{"cleaning", "walking"});
            put(monday.name(), new String[]{"cooking", "washing"});
            put(wednesday.name(), new String[]{"cinema", "take a rest"});
        }};
        mother.setSchedule(motherSchedule);

        //init daughter schedule
        Map<String, String[]> daughterSchedule = new HashMap<>() {{
            put(sanday.name(), new String[]{"cleaning", "walking"});
            put(monday.name(), new String[]{"cooking", "washing"});
            put(wednesday.name(), new String[]{"cinema", "take a rest"});
        }};
        daughter.setSchedule(daughterSchedule);
        
        //init son schedule
        Map<String, String[]> sonSchedule = new HashMap<>() {{
            put(sanday.name(), new String[]{"cleaning", "walking"});
            put(monday.name(), new String[]{"cooking", "washing"});
            put(wednesday.name(), new String[]{"cinema", "take a rest"});
        }};
        son.setSchedule(sonSchedule);
        //add pet to the family initialised above
//        addams.setPet(dog);

        //checking functionality of the Addams Family
        //Describe all family
        System.out.println("<-- Members of Addams family -->");
        System.out.println(addams.toString());
        System.out.println("<-- **** -->");
        //
//        father.describePet();
        father.greetPet();
//        father.feedPet();
        //
//        System.out.println(Arrays.toString(addams.getPet().getHabits()));
//        daughter.describePet();
//        son.describePet();
        //Get all family members
        System.out.println("<--  Number of family members: -->");
        System.out.println(addams.countFamily());
        System.out.println("<-- Father -->");
        System.out.println(addams.getFather());
        System.out.println("<-- Mother -->");
        System.out.println(addams.getMother());
        System.out.println("<-- Children -->");
        System.out.println(addams.getChildren());
        System.out.println("<-- Pet -->");
        System.out.println(addams.getPet());
        //
        System.out.println("<-- ****** -->");
        System.out.println("Get first child in the family");
        System.out.println(addams.getChildren().get(0));
        System.out.println("Get schedule of the first child");
        addams.getChildren().get(0);
//        System.out.println(addams.getChildren().get(0));
        //
        System.out.println("<-- ****** -->");
        System.out.println("Get second child in the family");
        System.out.println(addams.getChildren().get(1));
        System.out.println("Get schedule of the second child");
//        System.out.println(addams.getChildren().get(1));
    }
}