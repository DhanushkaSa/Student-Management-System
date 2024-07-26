package service;

import service.custom.StudentServiceImpl;

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
        
            default:
                return null;
        }
    }
}
