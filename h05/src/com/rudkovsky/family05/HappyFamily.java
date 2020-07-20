package com.rudkovsky.family05;

public class HappyFamily {
    public static void main(String[] args) {
        // Pet class constructors
        String[] dogHabits = {"woofing", "protect house", "having a walk"};
        Pet dog = new Pet("dog", "Bob", 5, 55, dogHabits);

        String[] catHabits = {"eat chicken", "drink a milk", "sleep a lot"};
        Pet cat = new Pet("cat", "Max", 8, 98, catHabits );

        System.out.println(dog.toString());
        cat.respond();
        cat.eat();
        cat.foul();
        System.out.println('\0');

        System.out.println(cat.toString());
        dog.respond();
        dog.eat();
        dog.foul();
        System.out.println('\0');


        Human father = new Human("Homes", "Addams", 1977);
        Human mother = new Human("Morticia", "Addams", 1979);
        Human daughter = new Human("Wednesday", "Addams", 1989, 120, dog, mother, father);
        Human sun = new Human("Pugsley", "Addams", 1995, 100, cat, mother, father);
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(daughter.toString());
        System.out.println(sun.toString());
        sun.describePet();
        daughter.greetPet();

    }
}
