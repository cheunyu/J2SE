package jdbc.statement;

import jdbc.drivermanager.DriverManagerExample;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author:cheunyu
 * @date:2018/5/10 1:31
 */
public class StatementExample {

    @Test
    public void insert() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, IOException {
        DriverManagerExample driverManagerExample = new DriverManagerExample();
        Connection conn = driverManagerExample.getConnection();

        String sql = "insert into user (name, password) values ('panda-jdbc','qwe123')";

        Statement statement = conn.createStatement();
        statement.execute(sql);
        statement.close();
        conn.close();
    }

    @Test
    public void select() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, IOException {
        DriverManagerExample driverManagerExample = new DriverManagerExample();
        Connection conn = driverManagerExample.getConnection();

        String sql = "select * from user";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + resultSet.getString(2) + resultSet.getString(3));
        }
        statement.close();
        conn.close();
    }
}
