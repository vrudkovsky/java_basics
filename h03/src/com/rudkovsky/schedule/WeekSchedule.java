package com.rudkovsky.schedule;

import java.util.Arrays;
import java.util.Scanner;

public class WeekSchedule {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

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


        while (!exit) {
            System.out.println("Please, input the day of the week or exit: ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                switch (answer.toLowerCase()) {
                    case "sunday":
                        System.out.println(schedule[0][1] + '\n');
                        break;
                    case "monday":
                        System.out.println(schedule[1][1] + '\n');
                        break;
                    case "tuesday":
                        System.out.println(schedule[2][1] + '\n');
                        break;
                    case "wednesday":
                        System.out.println(schedule[3][1] + '\n');
                        break;
                    case "thursday":
                        System.out.println(schedule[4][1] + '\n');
                        break;
                    case "friday":
                        System.out.println(schedule[5][1] + '\n');
                        break;
                    case "saturday":
                        System.out.println(schedule[6][1] + '\n');
                        break;
                    default:
                        System.out.println("Sorry, I don't understand you, please try again.");
                        break;
                }
            }
        }
    }
}
