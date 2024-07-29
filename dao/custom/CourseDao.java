package dao.custom;

import dao.SuperDao;
import entity.CourseEntity;

public interface CourseDao extends SuperDao{
    
    public CourseEntity getCourse(String Course_Id)throws Exception;
}
