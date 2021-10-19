package com.rudkovsky.family12.console;

import com.rudkovsky.family12.controller.FamilyController;
import com.rudkovsky.family12.dao.CollectionFamilyDao;
import com.rudkovsky.family12.entity.enums.Species;
import com.rudkovsky.family12.entity.human.Human;
import com.rudkovsky.family12.entity.human.Man;
import com.rudkovsky.family12.entity.human.Woman;
import com.rudkovsky.family12.entity.pet.Pet;
import com.rudkovsky.family12.service.FamilyService;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsoleMenu {
    public static FamilyController fc = new FamilyController(new FamilyService(new CollectionFamilyDao()));
    public static void run() {
        Scanner sc = new Scanner(System.in);
        boolean stopProgram = false;
        while (!stopProgram) {
            printMenu();
            String input = sc.nextLine().trim();

            switch (input) {
                case "1":
                    safeCall(ConsoleMenu::fileDB, sc);
                    break;
                case "2":
                    safeCall(ConsoleMenu::familyList, sc);
                    break;
                case "3":
                    safeCall(ConsoleMenu::familiesQHigherList, sc);
                    break;
                case "4":
                    safeCall(ConsoleMenu::familiesQLowerList, sc);
                    break;
                case "5":
                    safeCall(ConsoleMenu::countFamiliesByMembers, sc);
                    break;
                case "6":
                    safeCall(ConsoleMenu::createNewFamily, sc);
                    break;
                case "7":
                    safeCall(ConsoleMenu::deleteFamily, sc);
                    break;
                case "8":
                    printSubMenu();
                    String smselect = sc.nextLine().trim();
                    switch (smselect) {
                        case "1":
                            safeCall(ConsoleMenu::bornChild, sc);
                            break;
                        case "2":
                            safeCall(ConsoleMenu::addoptChild, sc);
                            break;
                        case "3":
                            break;
                        default:
                            System.out.println("Unknown command");
                    }
                    break;
                case "9":
                    safeCall(ConsoleMenu::deleteChild, sc);
                    break;
                case "10":
                    stopProgram = true;
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }

    private static void safeCall(Consumer<Scanner> consumer, Scanner sc) {
        try {
            consumer.accept(sc);
        } catch (Exception e) {
            System.err.printf("Error has happened %s\n", e.getMessage());
        }
    }

    private static void printMenu() {
        System.out.print('\n');
        System.out.println("Available commands: \n" +
                "1. Demo data initialization  \n" +
                "2. Show all family list  \n" +
                "3. Show all family list with number of members begger then  \n" +
                "4. Show all family list with number of members less then  \n" +
                "5. Count families with members equals to  \n" +
                "6. Create new family  \n" +
                "7. Delete family by index  \n" +
                "8. Edit family by index  \n" +
                "9. Delete children of given age from the family \n" +
                "10. Save list of family to the file \n" +
                "11. Download list of families form the file\n"
        );
        System.out.print('\n');
        System.out.print("Enter number of command or print exit to end the program \n");
    }

    private static void printSubMenu() {
        System.out.println(
                "- Born a child\n" +
                "- Adopt a child\n" +
                "- Return to main menu"
        );
    }

    private static <T> T readTyped(Scanner sc, Function<String, T> func, String errMessage) {
        T tValue = null;

        do {
            String input = sc.nextLine().trim();
            try {
                tValue = func.apply(input);
            } catch (Exception e) {
                System.out.println(errMessage);
            }
        } while (tValue == null);

        return tValue;
    }

    private static void fileDB (Scanner sc) {
        Pet dog = new Pet(Species.DOG, "Max") {
            @Override
            public void respond() {
                System.out.println("woof-woof-woof");
            }
        };

        dog.habits.add("run");
        dog.habits.add("sleep");

        try {
            fc.createNewFamily(
                    new Woman("Sarra", "Marley", 1977, 90),
                    new Man("Bob", "Marley", 1975, 125));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            fc.createNewFamily(
                    new Woman("Sveta", "Zaster", 1989, 123),
                    new Man("Max", "Zaster", 1979, 105));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            fc.createNewFamily(
                    new Woman("Helene", "Wild", 1999, 80),
                    new Man("John", "Wild", 1995, 115));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Families are created");
    }

    private static void familyList(Scanner sc) {
        fc.displayAllFamilies();
        System.out.println("Families list");
    }

    private static void familiesQHigherList(Scanner sc) {
        System.out.println("Enter number of people");
        Integer pb = readTyped(sc, Integer::parseInt, "Not a number");
        System.out.println("List of families with members bigger then" + pb + "");
        fc.getFamiliesBiggerThan(pb).forEach(f -> System.out.println(f.prettyFormat()));
    }

    private static void familiesQLowerList(Scanner sc) {
        System.out.println("Enter number of people");
        Integer pl = readTyped(sc, Integer::parseInt, "Not a number");
        System.out.println("List of families with members less then" + pl + "");
        fc.getFamiliesLessThan(pl).forEach(f -> System.out.println(f.prettyFormat()));
    }

    private static void countFamiliesByMembers(Scanner sc) {
        System.out.println("Enter number of people");
        Integer pq = readTyped(sc, Integer::parseInt, "Not a number");
        System.out.println("Quantity of families with members" + pq);
        System.out.printf("%d\n", fc.countFamiliesWithMemberNumber(pq));
    }

    private static void createNewFamily(Scanner sc) {
        System.out.println("Mother's name");
        String motherName = readTyped(sc, String::valueOf, "Not a string try again");
        System.out.println("Mother's surname");
        String motherSurname = readTyped(sc, String::valueOf, "Not a string try again");
        System.out.println("Mother's birthyear");
        Integer birthYear = readTyped(sc, Integer::parseInt, "Not a string try again");
        System.out.println("Mother's birthmonth");
        Integer birthMonth = readTyped(sc, Integer::parseInt, "Not a string try again");
        System.out.println("Mother's birthday");
        Integer birthDay = readTyped(sc, Integer::parseInt, "Not a string try again");
        System.out.println("Mother's IQ");
        Integer motherIq = readTyped(sc, Integer::parseInt, "Not a string try again");
        int motherBirth = birthYear;
        Human mother = null;
        try {
            mother = new Woman(motherName, motherSurname, motherBirth, motherIq);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Father's name");
        String fatherName = readTyped(sc, String::valueOf, "Not a string try again");
        System.out.println("Father's surname");
        String fatherSurname = readTyped(sc, String::valueOf, "Not a string try again");
        System.out.println("Father's birthyear");
        Integer fatherYear = readTyped(sc, Integer::parseInt, "Not a string try again");
        System.out.println("Father's birthmonth");
        Integer fatherBirthMonth = readTyped(sc, Integer::parseInt, "Not a string try again");
        System.out.println("Father's birthday");
        Integer fatherBirthDay = readTyped(sc, Integer::parseInt, "Not a string try again");
        System.out.println("Father's IQ");
        Integer fatherIq = readTyped(sc, Integer::parseInt, "Not a string try again");
        System.out.println(" Mother: Name" + motherName + "Surname " + motherSurname + "Day " + birthDay + "Month " + birthMonth + "Year " + birthYear + "IQ " + motherIq + " " +
                " Father: Name" + fatherName + "Surname " + fatherSurname + "Day " + fatherBirthDay + "Month " + fatherBirthMonth + "Year " + fatherYear + "IQ " + fatherIq + " ");
        int fatherBirth = fatherYear;
        Human father = null;
        try {
            father = new Man(fatherName, fatherSurname, fatherBirth, fatherIq);
        } catch (Exception e) {
            e.printStackTrace();
        }
        fc.createNewFamily(mother, father);
    }

    private static void deleteFamily(Scanner sc) {
        System.out.println("<< - deleteFamily - >>");

    }

    private static void deleteChild(Scanner sc) {
        System.out.println("<< - deleteChild - >>");

    }

    private static void bornChild(Scanner sc) {
        System.out.println("<< - bornChild - >>");

    }

    private static void addoptChild(Scanner sc) {
        System.out.println("<< - addoptChild - >>");

    }
}
