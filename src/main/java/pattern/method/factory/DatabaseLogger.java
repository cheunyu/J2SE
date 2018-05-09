package pattern.method.factory;

/**
 * Created by xiaoy on 2018/3/19.
 */
public class DatabaseLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("databaselogger write log");
    }
}
