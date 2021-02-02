package com.rudkovsky.family09.controller;

import com.rudkovsky.family09.entity.*;
import com.rudkovsky.family09.service.FamilyService;

import java.util.*;

public class FamilyController {
    private FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    public List<Family> getAllFamilies() {
        return this.familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        System.out.println(familyService.getAllFamilies());
    }

    public List<Family> getFamiliesBiggerThan(int number) {
        List<Family> selectedFamilies = new ArrayList<>();
        for (Family family : this.familyService.getAllFamilies()) {
            if (family.countFamily() > number) {
                selectedFamilies.add(family);
            }
        }

        return selectedFamilies;
    }

    public List<Family> getFamiliesLessThan(int number) {
        List<Family> selectedFamilies = new ArrayList<>();
        for (Family family : this.familyService.getAllFamilies()) {
            if (family.countFamily() < number) {
                selectedFamilies.add(family);
            }
        }

        return selectedFamilies;
    }

    public int countFamiliesWithMemberNumber(int number) {
        int count = 0;
        for (Family family : this.familyService.getAllFamilies()) {
            if (family.countFamily() == number) {
                count++;
            }
        }
        return count;
    }

    public boolean createNewFamily(Human mother, Human father) {
        return this.familyService.createNewFamily(mother, father);
    }

    public boolean deleteFamilyByIndex(int index) {
        return this.familyService.deleteFamilyByIndex(index);
    }

    public boolean bornChild(Family family, String fatherName, String motherName){
        if (family.getMother() == null || family.getFather() == null) {
            return false;
        }
        Random random = new Random();
        Human child;
        int year =  new Date().getYear();
        int iq = (family.getFather().getIq() + family.getMother().getIq()) / 2;
        if (random.nextInt(2) == 1) {
            String name = fatherName;
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            child = new Man("son", family.getFather().getName(), family.getFather().getSurname(),year, iq, family, null);
        } else {
            String name = motherName;
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            child = new Woman("daughter", family.getMother().getName(), family.getFather().getSurname(),year,iq, family,null);
        }
        family.addChild(child);
        return true;
    }

    public boolean adoptChild(Family family, Human human) {
        boolean check = false;
        for (Family currFamily : this.familyService.getAllFamilies()) {
            if (family.equals(currFamily)) {
                currFamily.addChild(human);
                check = true;
                break;
            }
        }
        return check;
    }

    public void deleteAllChildrenOlderThen(int age) {
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
//        for (Family9 family9 : collectionFamilyDao9.getAllFamilies()) {
//            List<Object> newChildrens = new ArrayList<>();
//            for (Human9 human9: family9.getChildren()) {
//                if ((year - human9.getYear()) > age) {
//                    newChildrens.add(human9);
//                }
//            }
//            for (int i = 0; i < newChildrens.size(); i++) {
//                family9.deleteChild(newChildrens.get(i));
//            }
//        }
    }

    public int count() {
        return this.familyService.getAllFamilies().size();
    }

    public Family getFamilyById(int index) {
        return this.familyService.getFamilyById(index);
    }

    public List<Pet> getPets(int index) {
        return this.familyService.getPets(index);
    }

    public boolean addPet(int index, Pet pet) {
        return this.familyService.addPet(index, pet);
    }

}
