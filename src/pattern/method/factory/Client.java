package pattern.method.factory;

/**
 * Created by xiaoy on 2018/3/19.
 */
public class Client {

    public static void main(String[] args) {
//        LoggerFactory loggerFactory = new FileLoggerFactory();
        LoggerFactory loggerFactory = (LoggerFactory) XMLUtil.getBean();
        Logger logger = loggerFactory.createLogger();
        logger.writeLog();
    }
}
