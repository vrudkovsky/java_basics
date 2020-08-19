package com.rudkovsky.family06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Pet class constructors
        String[] dogHabits = {"woofing", "protect house", "having a walk"};
        Pet dog = new Pet(Species.DOG, "Bob", 7, 60, dogHabits);

        String[] catHabits = {"eat chicken", "drink a milk", "sleep a lot"};
        Pet cat = new Pet(Species.CAT, "Max", 8, 98, catHabits );

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

        DayOfWeek sanday = DayOfWeek.SUNDAY;
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek thuesday = DayOfWeek.TUESDAY;
        DayOfWeek wednesday = DayOfWeek.WEDNESDAY;
        DayOfWeek thursday = DayOfWeek.THURSDAY;
        DayOfWeek friday = DayOfWeek.FRIDAY;
        DayOfWeek saturday = DayOfWeek.SATURDAY;

        String[][] daughterSchedule = {{"swiming", "Go waking"}, {"English classes", "Java classes"}};
        Human father = new Human("Homes", "Addams", 1977);
        Human mother = new Human("Morticia", "Addams", 1979);
//        Human daughter = new Human("Wednesday", "Addams", 1989, 110, cat);
        Human daughter = new Human("Wednesday", "Addams", 1989, 110, cat, daughterSchedule);
        Human sun = new Human("Pugsley", "Addams", 1995, 90, dog);
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(daughter.toString());
        System.out.println(sun.toString());
        sun.describePet();
        daughter.greetPet();
        System.out.println("Daughter Schedule = " + Arrays.deepToString(daughter.getSchedule()));

        for (String[] strings : daughterSchedule) {
            for (String string : strings) {
                System.out.println(sanday + string);
            }
        }
//        Human[] human = new Human[20000000];
//
//        for (int i = 0; i < 20000000; i++) {
//            human[i] = new Human("Serge", "Peterson", 1990);
//        }

    }
}
