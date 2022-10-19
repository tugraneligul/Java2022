package project.business;

import project.core.logging.Logger;
import project.dataAccess.CourseDao;
import project.entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses){
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void courseAdd(Course course) throws Exception{
        if(course.getPrice()<=0){
            throw new Exception("Kurs fiyatı 0 TL'den yüksek olmalıdır.");
        }

        for(Course courseFor : courses){

            if(courseFor.getCourseName().equals(course.getCourseName())){
                throw new Exception("Aynı isme sahip kurs bulunmaktadır. Farklı bir kur ismi giriniz.");
            }

        }

        courseDao.add(course);
        courses.add(course);
        for (Logger logger : loggers){
            logger.log(course.getCourseName());
        }
    }

}
