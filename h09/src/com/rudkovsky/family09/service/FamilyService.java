package com.rudkovsky.family09.service;

import com.rudkovsky.family09.dao.IFamilyDao;
import com.rudkovsky.family09.entity.*;

import java.util.*;

public class FamilyService {

    private final IFamilyDao familyDao;

    public FamilyService(IFamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamilies() {
        return this.familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        System.out.println(familyDao.getAllFamilies());
    }

    public List<Family> getFamiliesBiggerThan(int number) {
        List<Family> selectedFamilies = new ArrayList<>();
        for (Family family : this.familyDao.getAllFamilies()) {
            if (family.countFamily() > number) {
                selectedFamilies.add(family);
            }
        }

        return selectedFamilies;
    }

    public List<Family> getFamiliesLessThan(int number) {
        List<Family> selectedFamilies = new ArrayList<>();
        for (Family family : this.familyDao.getAllFamilies()) {
            if (family.countFamily() < number) {
                selectedFamilies.add(family);
            }
        }

        return selectedFamilies;
    }

    public int countFamiliesWithMemberNumber(int number) {
        int count = 0;
        for (Family family : this.familyDao.getAllFamilies()) {
            if (family.countFamily() == number) {
                count++;
            }
        }
        return count;
    }

    public boolean createNewFamily(Human mother, Human father) {
        return this.familyDao.saveFamily(new Family(mother, father));
    }

    public boolean deleteFamilyByIndex(int index) {
        return this.familyDao.deleteFamily(index);
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
        for (Family currFamily : this.familyDao.getAllFamilies()) {
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
        return this.familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int index) {
        return this.familyDao.getFamilyByIndex(index);
    }

    public List<Pet> getPets(int index) {
        return this.familyDao.getFamilyByIndex(index).getPets();
    }

    public boolean addPet(int index, Pet pet) {
        return this.familyDao.getFamilyByIndex(index).getPets().add(pet);
    }

}