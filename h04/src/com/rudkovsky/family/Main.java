package com.rudkovsky.family;

public class Main {
    public static void main(String[] args) {
        // Pet class constructors
        //Dog
        String[] dogHabits = {"woofing", "protect house", "having a walk"};
        Pet dog = new Pet("dog", "Bob", 5, 55, dogHabits);
        dog.eat();
        dog.respond();
        dog.foul();
        //Cat
        String[] catHabits = {"eat chicken", "drink a milk", "sleep a lot"};
        Pet cat = new Pet("cat", "Max", 8, 98, catHabits );
        cat.eat();
        cat.respond();
        cat.foul();

        //Family constructors
        Human father = new Human("father","Homes", "Addams", 1977);
        Human mother = new Human("mother","Morticia", "Addams", 1979);
        Human daughter = new Human("daughter","Wednesday", "Addams", 1999, mother, father);
        Human son = new Human("son","Pugsley", "Addams", 2005, 120, dog,mother, father);


        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(daughter.toString());
        System.out.println(son.toString());
        son.pet.respond();

    }
}