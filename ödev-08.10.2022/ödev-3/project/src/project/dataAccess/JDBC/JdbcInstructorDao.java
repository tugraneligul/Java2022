package project.dataAccess.JDBC;

import project.dataAccess.InstructorDao;
import project.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile veritabanına "+instructor.getInstructorFirstName()+" "+instructor.getInstructorLastName()+" isimli eğitmen eklendi.");

    }
}
