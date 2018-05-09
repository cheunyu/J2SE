package jdbc.statement;

import jdbc.drivermanager.DriverManagerExample;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author:cheunyu
 * @date:2018/5/10 1:31
 */
public class StatementExample {

    @Test
    public void statement() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, IOException {
        DriverManagerExample driverManagerExample = new DriverManagerExample();
        Connection conn = driverManagerExample.getConnection();

        String sql = "insert into user (name, password) values ('panda-jdbc','qwe123')";

        Statement statement = conn.createStatement();
        statement.execute(sql);
        statement.close();
    }
}
