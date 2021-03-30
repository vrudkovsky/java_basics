package com.rudkovsky.shooting;

public class BattleshipApp {
    public static void main(String[] args) {
        Game game = new Game();
        game.init(5);
        game.play();
        game.over();
    }

    public static void represent() {
        throw new IllegalArgumentException("Not yet");
    }
}
