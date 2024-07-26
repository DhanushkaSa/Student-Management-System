package dao.custom;

import dao.SuperDao;
import entity.StudentEntity;

public interface StudentDao extends SuperDao{
    
    public StudentEntity getStudent(String studentId,String password)throws Exception;
}
