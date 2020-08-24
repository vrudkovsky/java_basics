package com.rudkovsky.family09.service;

import com.rudkovsky.family10.dao.CollectionFamilyDao;
import com.rudkovsky.family10.entity.Family;
import com.rudkovsky.family10.entity.Human;
import com.rudkovsky.family10.entity.Pet;

import java.util.ArrayList;
import java.util.List;

public class FamilyService {
    private final CollectionFamilyDao collectionFamilyDao;

    public FamilyService(CollectionFamilyDao collectionFamilyDao) {
        this.collectionFamilyDao = collectionFamilyDao;
    }

    public List<Family> getAllFamilies(CollectionFamilyDao collectionFamilyDao) {
        return this.collectionFamilyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        System.out.println(collectionFamilyDao.toString());
    }

    public List<Family> getFamiliesBiggerThan(int count) {
        List<Family> sortedList = new ArrayList<>();
        for (Family family : this.collectionFamilyDao.getAllFamilies()) {
            if (family.countFamily() > count)
                sortedList.add(family);
        }
        return sortedList;
    }

    public List<Family> getFamiliesLessThan (int count) {
        List<Family> sortedList = new ArrayList<>();
        for (Family family : this.collectionFamilyDao.getAllFamilies()) {
            if (family.countFamily() < count)
                sortedList.add(family);
        }
        return sortedList;
    }

    public boolean createNewFamily(Human father, Human mother) {
        return this.collectionFamilyDao.saveFamily(new Family(mother, father));
    }

    public boolean deleteFamilyByIndex(int index) {
        return this.collectionFamilyDao.deleteFamily(index);
    }

    public Family bornChild(Family family, String fatherName, String motherName) {
        return new Family();
    }

    public Family adoptChild(Family family, Human child) {

        return new Family();
    }

    public void deleteAllChildrenOlderThan(int age) {

    }

    public int count() {
        return this.collectionFamilyDao.getAllFamilies().size();
    }

    public  Family getFamilyById(int familyId) {
        return this.collectionFamilyDao.getFamilyByIndex(familyId);
    }

    public List<Pet> getPets(int familyIndex) {
        return this.collectionFamilyDao.getFamilyByIndex(familyIndex).getPets();
    }

    public void addPet(int familyIndex, Pet pet) {
        this.collectionFamilyDao.getFamilyByIndex(familyIndex).addPet();
    }

}
