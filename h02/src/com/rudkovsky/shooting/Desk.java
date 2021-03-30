package com.rudkovsky.shooting;

import java.util.Arrays;

public class Desk {
    public Cell[][] field;

    Desk(int size) {
        this.field = new Cell[size][size];
    }

    public void initField() {
        System.out.println("Init field started");
        for (Cell[] cells : field) {
            Arrays.fill(cells, Cell.EMPTY);
        }
    }

    public void draw() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.printf(" %c ", field[i][j].show);
            }
            System.out.println();
        }
    }

    public static void represent() {
        throw new IllegalArgumentException("Not yet");
    }

    public void setShip(int x, int y, Cell v) {
        field[y][x] = v;
    }

    public void set(int x, int y, Cell v) {
        throw new IllegalArgumentException("Not yet");
    }

    public Cell get(int x, int y) {
        throw new IllegalArgumentException("Not yet");
    }
}
