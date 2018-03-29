package pattern.method.factory;

/**
 * Created by xiaoy on 2018/3/19.
 */
public class FileLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("filelogger write log");
    }

    
}
