package pattern.method.factory;

/**
 * Created by xiaoy on 2018/3/19.
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
