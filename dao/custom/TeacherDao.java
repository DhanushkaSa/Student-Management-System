package dao.custom;

import dao.SuperDao;

public interface TeacherDao extends SuperDao{

    public Integer getTeacherCount()throws Exception;
}
