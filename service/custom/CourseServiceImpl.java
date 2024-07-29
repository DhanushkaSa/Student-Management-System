package service.custom;

import dao.DaoFactory;
import dao.DaoFactory.DaoType;
import dao.custom.CourseDao;
import dto.CourseDto;
import entity.CourseEntity;

public class CourseServiceImpl implements CourseService{

    private CourseDao courseDao=(CourseDao) DaoFactory.getInstance().getDaoType(DaoType.COURSE);

    @Override
    public CourseDto getCourse(String Course_Id) throws Exception {
       
        CourseEntity entity=courseDao.getCourse(Course_Id);
        CourseDto dto=new CourseDto(entity.getCourse_Id(), entity.getCourse_Name(), entity.getCredit());
        return dto;
    }

    
    
}
