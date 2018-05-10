package jdbc.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author:cheunyu
 * @date:2018/5/10 16:53
 */
public class DBUtil {

    private static Connection conn;
    private static Properties properties;
    private static Statement statement;

    static {
        properties = new Properties();
        InputStream is = DBUtil.class.getClassLoader().getResourceAsStream("jdbc/util/jdbc.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName(properties.getProperty("mysql.driverClass"));
                conn = DriverManager.getConnection(properties.getProperty("mysql.url"), properties.getProperty("mysql.user"), properties.getProperty("mysql.password"));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static Statement getStatement() {
        try {
            statement = getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(PreparedStatement preparedStatement) {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
