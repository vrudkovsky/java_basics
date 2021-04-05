package com.rudkovsky.schedule;

import java.util.Scanner;

public class WeekSchedule {

    private static final String[][] schedule = new String[7][2];

    public static String[][] mySchedule(String[][] schedule) {
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

    public static void printTask(String day, String task) {
        System.out.printf("Your task for [%s] : %s\n", day, task);
    }

    public static void showTask(String day, String[][] schedule) {
        switch (day) {
            case "sunday":
                printTask(day, schedule[0][1]);
                break;
            case "monday":
                printTask(day, schedule[1][1]);
                break;
            case "tuesday":
                printTask(day, schedule[2][1]);
                break;
            case "wednesday":
                printTask(day, schedule[3][1]);
                break;
            case "thursday":
                printTask(day, schedule[4][1]);
                break;
            case "friday":
                printTask(day, schedule[5][1]);
                break;
            case "saturday":
                printTask(day, schedule[6][1]);
                break;
            default:
                System.out.println("Sorry, I don't understand you, please try again.");
                break;
        }
    }

    public static void main(String[] args) {
        String[][] sch = mySchedule(schedule);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please, input the day of the week:");
            String day = sc.nextLine().toLowerCase();
            if (day.equals("exit")) break;
            showTask(day, sch);
        }
    }
}
