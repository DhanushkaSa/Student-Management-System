package dao;

import dao.custom.StudentDaoImpl;

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
        
            default:
                return null;
        }
    }
}
