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



//        String[][] daughterSchedule = {{"swiming", "Go waking"}, {"English classes", "Java classes"}};
//        Human father = new Human("Homes", "Addams", 1977);
//        Human mother = new Human("Morticia", "Addams", 1979);
////        Human daughter = new Human("Wednesday", "Addams", 1989, 110, cat);
//        Human daughter = new Human("Wednesday", "Addams", 1989, 110, cat, daughterSchedule);
//        Human sun = new Human("Pugsley", "Addams", 1995, 90, dog);
//        System.out.println(mother.toString());
//        System.out.println(father.toString());
//        System.out.println(daughter.toString());
//        System.out.println(sun.toString());
//        sun.describePet();
//        daughter.greetPet();
//        System.out.println("Daughter Schedule = " + Arrays.deepToString(daughter.getSchedule()));
//
//        for (String[] strings : daughterSchedule) {
//            for (String string : strings) {
//                System.out.println(sanday + string);
//            }
//        }
//        Human[] human = new Human[20000000];
//
//        for (int i = 0; i < 20000000; i++) {
//            human[i] = new Human("Serge", "Peterson", 1990);
//        }

    }
}
