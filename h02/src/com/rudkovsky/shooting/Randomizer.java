package com.rudkovsky.shooting;

public class Randomizer {
    /**
     * Randomizer
     * @param from <= to
     * @param to number to what
     * @return random number in range [from to]
     */
    public int random_int(int from, int to) {
        double r = Math.random();           // [0, 1)
        double r1 = r * (to - from + 1);    // [0, to - from)
        double r2 = r1 + from;
        int r3 = (int) r2;
        return r3;
    }

    public int randomizer_0to10() {
        return random_int(0, 4);
    }
}
