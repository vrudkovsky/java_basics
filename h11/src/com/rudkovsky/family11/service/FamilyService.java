package com.rudkovsky.family11.service;

import com.rudkovsky.family11.dao.CollectionFamilyDao;
import com.rudkovsky.family11.entity.Family;
import com.rudkovsky.family11.entity.Human;
import com.rudkovsky.family11.entity.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FamilyService {
    private final CollectionFamilyDao collectionFamilyDao;

    public FamilyService(CollectionFamilyDao collectionFamilyDao) {
        this.collectionFamilyDao = collectionFamilyDao;
    }


    public List<Family> getAllFamilies() {
        return this.collectionFamilyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        this.collectionFamilyDao.getAllFamilies().forEach(p -> System.out.println(p.toString()));
    }

    public List<Family> getFamiliesBiggerThan(int count) {
        return this.collectionFamilyDao.getAllFamilies().stream()
                .filter(family -> family.countFamily() < count)
                .collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan (int count) {
        return this.collectionFamilyDao.getAllFamilies().stream()
                .filter(family -> family.countFamily() > count)
                .collect(Collectors.toList());
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
        this.collectionFamilyDao.getAllFamilies()
                .forEach(family -> {
                    family.toString();
                });

    }

    public int count() {
        return this.collectionFamilyDao.getAllFamilies().size();
    }

    public long countFamiliesWithMemberNumber(int count){
        return this.collectionFamilyDao.getAllFamilies().stream()
                .filter(family -> family.countFamily() == count).count();
    }



    public Family getFamilyById(int familyId) {
        return this.collectionFamilyDao.getFamilyByIndex(familyId);
    }

    public List<Pet> getPets(int familyIndex) {
        return this.collectionFamilyDao.getFamilyByIndex(familyIndex).getPets();
    }

    public void addPet(int familyIndex, Pet pet) {
        this.collectionFamilyDao.getFamilyByIndex(familyIndex).addPet();
    }



}
