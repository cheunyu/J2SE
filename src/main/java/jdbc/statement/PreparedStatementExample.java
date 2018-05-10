package jdbc.statement;

import jdbc.drivermanager.DriverManagerExample;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author:cheunyu
 * @date:2018/5/10 5:03
 */
public class PreparedStatementExample {

    @Test
    public void insert() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, IOException {
        DriverManagerExample driverManagerExample = new DriverManagerExample();
        Connection conn = driverManagerExample.getConnection();

        String sql = "insert into user values (?, ?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1,7);
        preparedStatement.setString(2, "Panda");
        preparedStatement.setString(3, "13144242");
        preparedStatement.execute();
        preparedStatement.close();
        conn.close();
    }
}
