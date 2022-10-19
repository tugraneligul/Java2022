package project.dataAccess.JDBC;

import project.dataAccess.CategoryDao;
import project.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanına "+category.getCategoryName()+" kategorisi eklendi.");

    }
}
