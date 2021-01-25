package com.rudkovsky.family09.service;

import com.rudkovsky.family09.dao.IFamilyDao;
import com.rudkovsky.family09.entity.Family;
import com.rudkovsky.family09.entity.Human;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FamilyService {
    private IFamilyDao familyDao;

    public FamilyService(IFamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamilies(IFamilyDao familyDao) {
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

    public Family bornChild(Family family, String motherName, String fatherName) {
        family.addChild(new Human("son", "Alex", family.getFather().getSurname(), LocalDateTime.now().getYear(), family));
         familyDao.saveFamily(family);
        return family;
    }

    public Family adoptChild(Family family, Human child) {

        return new Family();
    }

}
