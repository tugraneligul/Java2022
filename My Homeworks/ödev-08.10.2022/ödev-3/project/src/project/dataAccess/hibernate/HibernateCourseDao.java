package project.dataAccess.hibernate;

import project.dataAccess.CourseDao;
import project.entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına " +course.getCourseName()+" kursu eklendi.");
    }
}
