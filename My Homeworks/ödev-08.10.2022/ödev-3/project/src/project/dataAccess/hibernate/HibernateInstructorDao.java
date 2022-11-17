package project.dataAccess.hibernate;

import project.dataAccess.InstructorDao;
import project.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına "+instructor.getInstructorFirstName()+" "+instructor.getInstructorLastName()+" isimli eğitmen eklendi.");
    }
}
