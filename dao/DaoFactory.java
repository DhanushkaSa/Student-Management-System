package dao;

import dao.custom.CourseDaoImpl;
import dao.custom.StudentDaoImpl;
import dao.custom.TeacherDaoImpl;

public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {

    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public enum DaoType{
        STUDENT,TEACHER,COURSE
    }

    public SuperDao getDaoType(DaoType type){
        switch (type) {
            case STUDENT:
                
                return new StudentDaoImpl();

            case COURSE:
                return new CourseDaoImpl();
        
            case TEACHER:
                return new TeacherDaoImpl();
            default:
                return null;
        }
    }
}
