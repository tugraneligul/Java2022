package project.entities;

public class Category {

    private int id;
    private String categoryName;

    public Category(){

    }
    public Category(int id, String categoryName){
        this.setId(id);
        this.setCategoryName(categoryName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
