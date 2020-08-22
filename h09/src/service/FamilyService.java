package service;

import dao.CollectionFamilyDao;
import entity.Family;
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


}
