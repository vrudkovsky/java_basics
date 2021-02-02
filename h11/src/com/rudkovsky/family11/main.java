package com.rudkovsky.family11;

import com.rudkovsky.family11.controller.FamilyController;
import com.rudkovsky.family11.dao.CollectionFamilyDao;
import com.rudkovsky.family11.entity.Family;
import com.rudkovsky.family11.entity.Man;
import com.rudkovsky.family11.entity.Woman;
import com.rudkovsky.family11.service.FamilyService;

public class main {
    public static void main(String[] args) {
        CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();
        FamilyService familyService = new FamilyService(collectionFamilyDao);
        FamilyController familyController = new FamilyController(familyService);

        Woman mother = new Woman("Megan", "Addams", 1977, 90);
        Man father = new Man("Max", "Addams", 1977, 90);

        familyController.createNewFamily(father, mother);
        Family family = familyController.getFamilyById();
//        familyController.bornChild(family, family.getFather().getName(), family.getMother().getName());
        familyController.displayAllFamilies();
    }
}
