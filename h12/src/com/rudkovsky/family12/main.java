package com.rudkovsky.family12;

import com.rudkovsky.family12.controller.FamilyController;
import com.rudkovsky.family12.dao.CollectionFamilyDao;
import com.rudkovsky.family12.service.FamilyService;

public class main {
    public static void main(String[] args) {
        CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();
        FamilyService familyService = new FamilyService(collectionFamilyDao);
        FamilyController familyController = new FamilyController(familyService);

        familyController = null;
    }
}
