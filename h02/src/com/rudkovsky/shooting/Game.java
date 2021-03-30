package com.rudkovsky.shooting;

public class Game {
    public void init(int size) {
        System.out.println("Let's game begin");
        Desk d = new Desk(size);
        d.initField();
        d.setShip(
                new Randomizer().randomizer_0to10(),
                new Randomizer().randomizer_0to10(),
                Cell.SHIP);
        d.draw();
    }

    public void play() {
        System.out.println("Game play");
    }

    public void over() {
        System.out.println("Game over!");
    }
}
