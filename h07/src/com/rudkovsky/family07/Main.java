package com.rudkovsky.family07;

public class Main {
    public static void main(String[] args) {

        String[] dogHabits = {"woofing", "protect house", "having a walk"};
        String[] catHabits = {"eat chicken", "drink a milk", "sleep a lot"};
        String[] fisHabits = {"eat fishfood", "swiming"};

        // Dog class constructors
        Dog dog = new Dog("Bob", 5, 90, dogHabits);
        System.out.println(dog);
        dog.respond();
        dog.eat();
        dog.foul();
        System.out.println(dog.toString());
        System.out.println('\0');

        // Cat class constructors
        DomesticCat cat = new DomesticCat("Max", 7, 98, catHabits);
        System.out.println(cat);
        cat.respond();
        cat.eat();
        cat.foul();
        System.out.println(cat.toString());
        System.out.println('\0');

        // Fish class constructor
        Fish fish = new Fish("Golden", 1, 50,fisHabits);
        System.out.println(fish);
        fish.respond();
        fish.eat();
        System.out.println(fish.toString());
        System.out.println('\0');

    }
}
