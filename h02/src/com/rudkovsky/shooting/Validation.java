package com.rudkovsky.shooting;

import java.util.Optional;
import java.util.Scanner;

public class Validation {
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
}
