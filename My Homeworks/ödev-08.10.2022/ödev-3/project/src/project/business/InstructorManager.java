package project.business;

import project.core.logging.Logger;
import project.dataAccess.InstructorDao;
import project.entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers){
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void instructorAdd(Instructor instructor){
        System.out.println("Eğitmenin Adı : "+ instructor.getInstructorFirstName()+" "+instructor.getInstructorLastName());
        instructorDao.add(instructor);

        for (Logger logger:loggers){
            logger.log(instructor.getInstructorFirstName());
        }
    }
}
