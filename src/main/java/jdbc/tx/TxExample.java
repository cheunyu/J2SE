package jdbc.tx;

import jdbc.util.DBUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author:cheunyu
 * @date:2018/5/10 17:53
 */
public class TxExample {

    @Test
    public void tx() {
        Connection conn = DBUtil.getConnection();
        PreparedStatement preparedStatement;
        PreparedStatement preparedStatement1;
        try {
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement("insert into user (name, password) values(?,?)");
            preparedStatement.setString(1, "Panda");
            preparedStatement.setString(2,"qwe123");
            preparedStatement.execute();
            System.out.println("insert one data");

            preparedStatement1 = conn.prepareStatement("insert into user (name, password) values(?,?,?)");
            preparedStatement1.setString(1, "Panda");
            preparedStatement1.setString(2,"qwe123");
            preparedStatement1.execute();
            System.out.println("insert two data");

            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }
}
