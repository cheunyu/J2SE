package jdbc.drivermanager;

import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class JdbcDriverTest {

    @Test
    public void driver() throws SQLException {
        JdbcDriver jdbcDriver = new JdbcDriver();
        jdbcDriver.driver();
    }

    @Test
    public void driver2() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, IOException {
        JdbcDriver jdbcDriver = new JdbcDriver();
        jdbcDriver.driver2();
    }
}