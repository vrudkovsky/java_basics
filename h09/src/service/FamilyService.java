package service;

import dao.CollectionFamilyDao;
import entity.Family;

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
            int familyMembers = 0;
            if (family.getFather() != null)
                familyMembers++;
            if (family.getMother() != null)
                familyMembers++;
            familyMembers += family.getChildren().size();
            if (familyMembers > count)
                sortedList.add(family);
        }
        return sortedList;
    }

    public List<Family> getFamiliesLessThan (int count) {
        List<Family> sortedList = new ArrayList<>();
        for (Family family : this.collectionFamilyDao.getAllFamilies()) {
            int familyMembers = 0;
            if (family.getFather() != null)
                familyMembers++;
            if (family.getMother() != null)
                familyMembers++;
            familyMembers += family.getChildren().size();
            if (familyMembers > count)
                sortedList.add(family);
        }
        return sortedList;
    }


}
