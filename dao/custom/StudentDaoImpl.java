package dao.custom;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBConnection;
import entity.StudentEntity;

public class StudentDaoImpl implements StudentDao{

    @Override
    public StudentEntity getStudent(String studentId,String password) throws Exception {
       
        String sql="SELECT * FROM Student WHERE Student_Id=? and password=?";
        PreparedStatement statement=DBConnection.getInstance().getConnection().prepareStatement(sql);
        statement.setString(1, studentId);
        statement.setString(2, password);
        ResultSet srt=statement.executeQuery();
        if(srt.next()){
            StudentEntity entity=new StudentEntity(srt.getString(1), srt.getString(2), Integer.parseInt(srt.getString(3)), srt.getString(4), srt.getString(5), srt.getString(6));
            return entity;
        }
        return null;
        
    }
    

}
