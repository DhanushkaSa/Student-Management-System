package dao.custom;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBConnection;
import entity.CourseEntity;

public class CourseDaoImpl implements CourseDao{

    @Override
    public CourseEntity getCourse(String Course_Id) throws Exception {

        String sql="SELECT * FROM Course WHERE Course_Id= ?";
        PreparedStatement statement=DBConnection.getInstance().getConnection().prepareStatement(sql);
        statement.setString(1, Course_Id);
        ResultSet srt=statement.executeQuery();
        if(srt.next()){
           CourseEntity entity=new CourseEntity(srt.getString(1), srt.getString(2), Integer.parseInt(srt.getString(3)));
            return entity;
        }
        return null;
    }
    
}
