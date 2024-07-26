package service.custom;

import java.util.ArrayList;

import dao.DaoFactory;
import dao.custom.StudentDao;
import dto.StudentDto;
import entity.StudentEntity;

public class StudentServiceImpl implements StudentService {

    private StudentDao dao = (StudentDao) DaoFactory.getInstance().getDaoType(DaoFactory.DaoType.STUDENT);

    @Override
    public StudentDto getStudent(String studentId, String password) throws Exception {

        StudentEntity entity = dao.getStudent(studentId, password);
        if (entity == null) {
            return null;
        } else {
            StudentDto dto = new StudentDto(entity.getStudent_Id(), entity.getStudent_Name(), entity.getAge(),
                    entity.getTelephone(), entity.getEmail(), entity.getPassword(), null);
            return dto;
        }

    }

}
