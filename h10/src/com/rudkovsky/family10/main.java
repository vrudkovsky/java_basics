package com.rudkovsky.family10;

import com.rudkovsky.family10.controller.FamilyController;
import com.rudkovsky.family10.dao.CollectionFamilyDao;
import com.rudkovsky.family10.service.FamilyService;

public class main {
    public static void main(String[] args) {
        CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();
        FamilyService familyService = new FamilyService(collectionFamilyDao);
        com.rudkovsky.family10.controller.FamilyController familyController = new FamilyController(familyService);

        familyController = null;
    }
}
