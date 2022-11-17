package project.dataAccess.JDBC;

import project.dataAccess.CourseDao;
import project.entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("JDBC ile veritabanına " +course.getCourseName()+" kursu eklendi.");

    }
}
