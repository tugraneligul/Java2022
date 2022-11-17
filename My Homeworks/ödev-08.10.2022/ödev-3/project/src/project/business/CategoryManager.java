package project.business;

import project.core.logging.Logger;
import project.dataAccess.CategoryDao;
import project.entities.Category;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private List<Category> categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories){
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void categoryAdd(Category category) throws Exception {
        for(Category categoryFor : categories){
            if(categoryFor.getCategoryName().equals(category.getCategoryName())){
                throw new Exception("Aynı isme sahip kategori bulunmaktadır. Farklı bir kategori ismi giriniz.");
            }
        }

        categoryDao.add(category);
        categories.add(category);

        for (Logger logger : loggers){
            logger.log(category.getCategoryName());
        }

    }

}
