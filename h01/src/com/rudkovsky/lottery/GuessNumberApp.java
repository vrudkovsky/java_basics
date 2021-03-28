package com.rudkovsky.lottery;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class GuessNumberApp {
    private static String name;
    private static int rn;
    private static int nt = 4;
    private static final Resize a = new Resize();

    private static final String[][] events = {
            {"Бостонское чаепитие?", "1773"},
            {"Начало войны за независимость США?", "1775"},
            {"Провозглошение независимости США,", "1776"},
            {"Принятие Конституции США?", "1787"},
            {"Начало Американо-Мексиканской войны?", "1846"},
            {"Золотая лихорадка в Калифорнии?", "1848"},
            {"Начало Гражданской войны между Севером и Югом?", "1861"},
            {"Генри Форд основал The Ford Motor Company?", "1903"},
            {"Начало Великой Депрессии?", "1929"}
    };

    public static void main(String[] args) {
        start();
        guessNumber();
        System.out.printf("Your numbers %s\n", Arrays.toString(sort(a.getA())));
        System.out.printf("Game over %s!!!\n", name);
    }

    public static void start() {
        System.out.println("Let the game begin!");
        System.out.println("Please enter your name:");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        //random number
        Randomizer random = new Randomizer();
        rn = random.randomizer_0to10();
        System.out.printf("Answer %s\n", events[rn][1]);
    }

    public static boolean isValidNumber(int x) {
        return x >= 0 && x <= 2000;
    }

    public static Optional<Integer> toInt(String line) {
        try {
            int x = Integer.parseInt(line);
            return Optional.of(x);
        } catch (NumberFormatException x) {
            return Optional.empty();
        }
    }

    public static int waitForInt(Scanner sc) {
        String line = sc.next();
        Optional<Integer> r = toInt(line);
        if (!r.isPresent() || !isValidNumber(r.get())) {
            System.out.println("Wrong input number, try it again");
            return waitForInt(sc);
        }
        return r.get();
    };

    public static void guessNumber() {
        System.out.printf("Quetion: %s\n", events[rn][0]);
        while (nt > 0) {
            Scanner sc = new Scanner(System.in);
            int x = waitForInt(sc);
            a.add(x);
            int i = Integer.parseInt(events[rn][1]);
            if (x == i) {
                System.out.printf("Congratulations, %s!\n", name);
                break;
            }
            nt--;
            System.out.println("Try once again");
        }
        System.out.println("You did not win");
    }

    static int[] sort(int[] a) {
        int[] x = a.clone();
        Arrays.sort(x);
        return x;
    }


}
