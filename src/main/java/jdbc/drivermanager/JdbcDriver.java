package jdbc.drivermanager;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author:cheunyu
 * @date:2018/5/10 0:21
 */
public class JdbcDriver {
    public void driver() throws SQLException {
        Driver driver = new com.mysql.jdbc.Driver();

        String url = "jdbc:mysql://localhost:3306/jdbctemplate";
        Properties info = new Properties();
        info.put("user", "root");
        info.put("password", "qwe123");

        Connection conn = driver.connect(url, info);
        System.out.println(conn);
    }
    
    /**
     * @description:数据库解耦
     * @param:[]
     * @return:void
     */
    @Test
    public void driver2() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        InputStream is = getClass().getClassLoader().getResourceAsStream("jdbc/drivermanager/jdbc.properties");
        Properties properties = new Properties();
        properties.load(is);
        String driverClass = properties.getProperty("jdbc.driverClass");
        String url = properties.getProperty("jdbc.url");
        String user = properties.getProperty("jdbc.user");
        String password = properties.getProperty("jdbc.password");

        Driver driver = (Driver) Class.forName(driverClass).newInstance();

        Properties info = new Properties();
        info.put("user", user);
        info.put("password", password);

        Connection conn = driver.connect(url, info);
        System.out.println(conn);
    }

}
