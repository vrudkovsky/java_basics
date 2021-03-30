package com.rudkovsky.shooting;

public enum Cell {
    EMPTY('-'),
    SHIP('*'),
    SHIP_DAMAGED('X'),
    MISSED('.');

    final char show;

    Cell(char show) {
        this.show = show;
    }
}
