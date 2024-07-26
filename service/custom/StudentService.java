package service.custom;

import dao.custom.StudentDao;
import dto.StudentDto;
import service.SuperService;

public interface StudentService extends SuperService{
    
    public StudentDto getStudent(String studentId,String password)throws Exception;
}
