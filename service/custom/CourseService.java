package service.custom;

import dto.CourseDto;
import service.SuperService;

public interface CourseService extends SuperService{
    
    public CourseDto getCourse(String Course_Id)throws Exception;
}
