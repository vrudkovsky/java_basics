package com.rudkovsky.family05;

public class Main {
    public static void main(String[] args) {
        //first family
        Human mother = new Human("Sara", "Addoms" , 1979);
        Human father = new Human("Max", "Addams", 1975);
        Human child1 = new Human("Helen", "Addams", 2005);
        Human child2 = new Human("Alex", "Addams", 2007);
        Pet pet = new Pet("dog", "Jasper", 4, 75, new String[] {"Eat", "Walk", "Sleep"});

        Family family1 = new Family(mother, father, new Human[] {child1, child2}, pet);

//        family1.describePet();
        System.out.println(family1.getPet().toString());

    }
}