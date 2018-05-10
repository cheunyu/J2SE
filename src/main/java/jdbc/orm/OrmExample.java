package jdbc.orm;

import jdbc.util.DBUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:cheunyu
 * @date:2018/5/11 0:34
 */
public class OrmExample {

    @Test
    public List<User> findAllUser() {
        System.out.println("1");
        Connection conn = DBUtil.getConnection();
        PreparedStatement ps = null;
        List<User> userList = new ArrayList<>();
        try {
            ps = conn.prepareStatement("select * from user ");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3));
                userList.add(user);
                System.out.println(user.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DBUtil.close(ps);
        DBUtil.close(conn);
        return userList;
    }

    public static void main(String[] args) {
        OrmExample o = new OrmExample();
        o.findAllUser();
    }
}
