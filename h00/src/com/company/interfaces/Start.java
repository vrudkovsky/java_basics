package com.company.interfaces;

public class Start {
    public static void main(String[] args) {
        Boy ivan = new Boy("Ivan");
        Girl olga = new Girl("Olga");

        //create variable based on interface
        Player unit = ivan;
        Player unit2 = olga;
        Study student = ivan;
        Study student2 = olga;

        Game game = new Game();
        School school = new School();

        game.start(unit);
        game.start(unit2);
        school.study(student);
        school.study(student2);


    }
}
