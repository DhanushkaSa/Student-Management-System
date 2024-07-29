package service;

import service.custom.CourseServiceImpl;
import service.custom.StudentServiceImpl;
import service.custom.TeacherServiceImpl;

public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory=new ServiceFactory();
        }
        return serviceFactory;
    }

    public enum ServiceType{
       STUDENT,TEACHER,COURSE
    }

    public SuperService getServiceType(ServiceType type){
        switch (type) {
            case STUDENT:
                return new StudentServiceImpl();
            case COURSE:
                return new CourseServiceImpl();
            case TEACHER:
                return new TeacherServiceImpl();
            default:
                return null;
        }
    }
}
