package com.rudkovsky.family;

import java.util.Arrays;

public class Main {

    public static String[][] schedule(String[][] schedule) {
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do homework; do some shopping;";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to the office; go to courses; to watch a film;";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to courses; lunch with partners; to wash a car;";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "go to courses; watch a film;";
        schedule[4][0] = "Thursday ";
        schedule[4][1] = "go to the office; have a lunch with friends;";
        schedule[5][0] = "Friday";
        schedule[5][1] = "go to english classes; to go to the movies; ";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "got to he gym; clean home;";

        return schedule;
    }

    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        String[][] mySchedule = schedule(schedule);

        Pet pet = new Pet("dog", "Max", 3, 95, new String[]{"eat", "gav", "waking"});
        Human mother = new Human("Marry", "Addams", 1977);
        Human father = new Human("Gary", "Addams", 1975);
        Human child = new Human("Alex", "Addams", 1989, 100, pet, mother, father, mySchedule);

        System.out.println(mother);
        System.out.println(child);
    }
}