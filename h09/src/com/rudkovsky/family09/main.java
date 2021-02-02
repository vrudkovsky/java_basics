package com.rudkovsky.family09;

import com.rudkovsky.family09.controller.FamilyController;
import com.rudkovsky.family09.dao.CollectionFamilyDao;
import com.rudkovsky.family09.entity.Human;
import com.rudkovsky.family09.service.FamilyService;

public class main {
    public static void main(String[] args) {
        CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();
        FamilyService familyService = new FamilyService(collectionFamilyDao);
        FamilyController familyController = new FamilyController(familyService);

        Human mother = new Human("mother", "Elison", "Addams", 1977);
        Human father = new Human("father", "Peter", "Addams", 1975);

        familyController.createNewFamily(mother, father);

        familyController.displayAllFamilies();
    }
}

