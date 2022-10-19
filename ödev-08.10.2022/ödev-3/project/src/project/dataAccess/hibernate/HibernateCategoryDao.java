package project.dataAccess.hibernate;

import project.dataAccess.CategoryDao;
import project.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına "+category.getCategoryName()+" kategorisi eklendi.");
    }
}
