package com.rudkovsky.lottery;

public class Resize {
    private final int INITIAL_SIZE = 4;
    private final double k = 1.5;
    private int size = INITIAL_SIZE;
    private int pos = 0;
    private int[] a = new int[INITIAL_SIZE];

    public void resize() {
        size = (int) (size * k);
        int[] a2 = new int[size];
        System.arraycopy(a,0, a2, 0, a.length);
        a = a2;
    }

    public void resizeIfNeeded() {
        if (pos == size) resize();
    }

    public void add(int x) {
        resizeIfNeeded();
        a[pos++] = x;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }
}