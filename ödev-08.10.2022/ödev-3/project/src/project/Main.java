package project;

import project.business.CategoryManager;
import project.business.CourseManager;
import project.business.InstructorManager;
import project.core.logging.DatabaseLogger;
import project.core.logging.EmailLogger;
import project.core.logging.FileLogger;
import project.core.logging.Logger;
import project.dataAccess.JDBC.JdbcCategoryDao;
import project.dataAccess.hibernate.HibernateCategoryDao;
import project.dataAccess.hibernate.HibernateCourseDao;
import project.dataAccess.hibernate.HibernateInstructorDao;
import project.entities.Category;
import project.entities.Course;
import project.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};

        List<Course> courseDb = new ArrayList<>();
        List<Category> categoryDb = new ArrayList<>();

        Category category1 = new Category(1,"Programlama");
        Category category2 = new Category(2,"Mobil Programlama");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers,categoryDb);
        categoryManager.categoryAdd(category1);
        categoryManager.categoryAdd(category2);


        Course course1 = new Course(1,"C#+ANGULAR",1500);
        Course course2 = new Course(2,".NET",2000);
        Course course3 = new Course(3,"JAVA",2500);
        Course course4 = new Course(4,"JavaScript",3000);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers,courseDb);
        courseManager.courseAdd(course1);
        courseManager.courseAdd(course2);
        courseManager.courseAdd(course3);
        courseManager.courseAdd(course4);


        Instructor instructor = new Instructor(1,"Engin","Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
        instructorManager.instructorAdd(instructor);


    }
}