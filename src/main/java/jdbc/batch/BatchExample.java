package jdbc.batch;

import jdbc.util.DBUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author:cheunyu
 * @date:2018/5/10 16:52
 */
public class BatchExample {

    @Test
    public void batch() {
        Connection conn = DBUtil.getConnection();
        try {
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Statement statement = DBUtil.getStatement();
        try {
            for(int i=0;i<20000;i++) {
                statement.addBatch("insert into user (name, password) values('Panda" + i + "','123456')");
            }
            statement.executeBatch();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DBUtil.close(statement);
        DBUtil.close(conn);
    }
}
