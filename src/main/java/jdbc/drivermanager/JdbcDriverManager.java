package jdbc.drivermanager;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author:cheunyu
 * @date:2018/5/10 1:18
 * @deprecated:DriverManager管理多个驱动
 */
public class JdbcDriverManager {

    @Test
    public Connection getConnection() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("jdbc/drivermanager/jdbc.properties");
        Properties properties = new Properties();
        properties.load(inputStream);

        String driverClass = properties.getProperty("jdbc.driverClass");
        String url = properties.getProperty("jdbc.url");
        String user = properties.getProperty("jdbc.user");
        String password = properties.getProperty("jdbc.password");

        Class.forName(driverClass);

        return DriverManager.getConnection(url ,user, password);
    }
}
