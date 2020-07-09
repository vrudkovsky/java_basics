package com.rudkovsky.schedule;

import java.util.Arrays;
import java.util.Scanner;

public class WeekSchedule {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        Scanner scanner = new Scanner(System.in);

        schedule[0][0] = "Sunday";
        schedule[0][1] = "to do homework; do some shopping;";
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

        System.out.println("Please, input the day of the week: ");
        String answer = scanner.next();

        System.out.println(answer);

//        System.out.println(Arrays.deepToString(schedule));

    }
}
