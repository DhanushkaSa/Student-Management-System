package service.custom;

import dao.DaoFactory;
import dao.DaoFactory.DaoType;
import dao.custom.TeacherDao;

public class TeacherServiceImpl implements TeacherService {

    private TeacherDao teacherDao = (TeacherDao) DaoFactory.getInstance().getDaoType(DaoType.TEACHER);

    @Override
    public Integer getTeacherCount() throws Exception {
       return teacherDao.getTeacherCount();
    }

}
