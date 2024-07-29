package dao.custom;

import java.sql.PreparedStatement;

import connection.DBConnection;

public class TeacherDaoImpl implements TeacherDao{

    @Override
    public Integer getTeacherCount() throws Exception {
        String sql="SELECT COUNT(*) FROM Teacher";
        PreparedStatement statement=DBConnection.getInstance().getConnection().prepareStatement(sql);
        int value=statement.executeUpdate();
        return value;
    }
    
}
