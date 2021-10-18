package com.rudkovsky.family12.console;

import com.rudkovsky.family12.controller.FamilyController;
import com.rudkovsky.family12.dao.CollectionFamilyDao;
import com.rudkovsky.family12.entity.human.Human;
import com.rudkovsky.family12.entity.human.Man;
import com.rudkovsky.family12.entity.human.Woman;
import com.rudkovsky.family12.service.FamilyService;

import java.util.Locale;
import java.util.Scanner;

public class ConsoleMenu {
    public static void run() {
        FamilyController fc = new FamilyController(new FamilyService(new CollectionFamilyDao()));
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
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
                    "\t1. Born a child  \n" +
                    "\t2. Adopt a child  \n" +
                    "\t3. Return to main menu \n" +
                    "9. Delete children of given age from the family \n" +
                    "10. Save list of family to the file \n" +
                    "11. Download list of families form the file\n"
            );
            System.out.print('\n');
            System.out.print("Enter number of command or print exit to end the program \n");

            try {
                input = sc.nextLine().trim().toLowerCase();

                if (input.equals("exit")) {
                    System.out.println("Program is over");
                    break;
                }

                switch (input) {
                    case ("1"):
                        fc.init();
                        break;
                    case ("2"):
                        fc.displayAllFamilies();
                        break;
                    case ("3"):
                        System.out.println("Enter age");
                        String ab = sc.nextLine().trim();
                        fc.getFamiliesBiggerThan(Integer.parseInt(ab));
                        break;
                    case ("4"):
                        System.out.println("Enter age");
                        String al = sc.nextLine().trim();
                        fc.getFamiliesLessThan(Integer.parseInt(al));
                        break;
                    case ("5"):
                        System.out.println("Enter age");
                        String aq = sc.nextLine().trim();
                        fc.countFamiliesWithMemberNumber(Integer.parseInt(aq));
                        break;
                    case ("6"):
                        System.out.println("Enter mother name");
                        String motherName = sc.nextLine().trim();
                        System.out.println("Enter mother surname");
                        String motherSurname = sc.nextLine().trim();
                        System.out.println("Enter mother year of birth");
                        String motherYear = sc.nextLine().trim();
                        System.out.println("Enter mother month of birth");
                        String motherMonth = sc.nextLine().trim();
                        System.out.println("Enter mother birthday");
                        String motherBirthday = sc.nextLine().trim();
                        System.out.println("Enter mother IQ");
                        String motherIQ = sc.nextLine().trim();

                        System.out.println("Enter father name");
                        String fatherName = sc.nextLine().trim();
                        System.out.println("Enter father surname");
                        String fatherSurname = sc.nextLine().trim();
                        System.out.println("Enter father year of birth");
                        String fatherYear = sc.nextLine().trim();
                        System.out.println("Enter father month of birth");
                        String fatherMonth = sc.nextLine().trim();
                        System.out.println("Enter father birthday");
                        String fatherBirthday = sc.nextLine().trim();
                        System.out.println("Enter father IQ");
                        String fatherIQ = sc.nextLine().trim();
                        Woman mother = new Woman(motherName, motherSurname, Integer.parseInt(motherYear), Integer.parseInt(motherIQ));
                        Man father = new Man(fatherName, fatherSurname, Integer.parseInt(fatherYear), Integer.parseInt(fatherIQ));
                        fc.createNewFamily(father, mother);
                        break;
                    case ("7"):
                        System.out.println("Enter family number");
                        String fnumber = sc.nextLine().trim();
                        fc.deleteFamilyByIndex(Integer.parseInt(fnumber));
                        break;
                    case ("8"):
                        System.out.println('\n');
                        System.out.println("Available commands:\n" +
                                "1. To born child" +
                                "2. To adopt child" +
                                "3. Return to main menu"
                                );
                        String userInput = sc.nextLine().trim();
                        int familyId;
                        switch (userInput) {
                            case ("1"):
                                System.out.print("Enter family number\n");
                                familyId = Integer.parseInt(sc.nextLine().trim()) - 1;
                                System.out.print("Enter boy's name\n");
                                String boysName = sc.nextLine().trim().toLowerCase();
                                System.out.print("Enter girl's name\n");
                                String girlsName = sc.nextLine().trim().toLowerCase();
                                fc.bornChild(fc.getFamilyById(familyId), boysName, girlsName);
                                break;
                            case ("2"):
                                System.out.print("Enter family number\n");
                                familyId = Integer.parseInt(sc.nextLine().trim()) - 1;
                                System.out.print("Enter child's name\n");
                                String childName = sc.nextLine().trim().toLowerCase();
                                System.out.print("Enter child's surname\n");
                                String childSurName = sc.nextLine().trim().toLowerCase();
                                System.out.print("Enter child's birthyear\n");
                                String childsYear = sc.nextLine().trim();
                                System.out.print("Введите IQ ребенка\n");
                                String childsIq = sc.nextLine().trim();
                                fc.adoptChild(fc.getFamilyById(familyId), new Human(childName, childSurName, Integer.parseInt(childsYear), Integer.parseInt(childsIq)));
                                break;
                            case ("3"):
                                break;
                            default:
                                System.out.println("You've entered wrong data");
                                break;
                        }
                        break;
                    case ("9"):

                        break;
                    case ("10"):

                        break;
                    case ("11"):

                        break;

                }

            } catch (RuntimeException e) {
                System.out.printf("You've entered wrong data. It led to error number %s %s \n", e.getCause(), e.getMessage());
            }

        }
    }

    public static void  init() {
        //Main menu initializer
    }

    private static void safeCall() {
        System.out.println("<< - safe call - >>");

    }

    private static void printMenu() {
        System.out.println("<< - printMenu - >>");

    }

    private static void printSubMenu() {
        System.out.println("<< - printSubMenu - >>");

    }

    private static void fileDB () {
        //File with the data
        System.out.println("<< - fileDB - >>");
    }

    private static void familyList() {
        // List of all families
        System.out.println("<< - List of all families - >>");
    }

    private static void familiesQHigherList() {
        System.out.println("<< - familiesQHigherList - >>");

    }

    private static void familiesQLowerList() {
        System.out.println("<< - familiesQLowerList - >>");

    }

    private static void countFamiliesByMembers() {
        System.out.println("<< - countFamiliesByMembers - >>");

    }

    private static void createNewFamily() {
        System.out.println("<< - createNewFamily - >>");

    }

    private static void deleteFamily() {
        System.out.println("<< - deleteFamily - >>");

    }

    private static void deleteChild() {
        System.out.println("<< - deleteChild - >>");

    }

    private static void bornChild() {
        System.out.println("<< - bornChild - >>");

    }

    private static void addoptChild() {
        System.out.println("<< - addoptChild - >>");

    }
}
