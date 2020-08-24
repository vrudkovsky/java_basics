import controller.FamilyController;
import dao.CollectionFamilyDao;
import service.FamilyService;

public class main {
    public static void main(String[] args) {
        CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();
        FamilyService familyService = new FamilyService(collectionFamilyDao);
        FamilyController familyController = new FamilyController(familyService);

        familyController = null;
    }
}
