package pattern.method.factory;

/**
 * Created by xiaoy on 2018/3/19.
 */
public class Client {

    public static void main(String[] args) {
<<<<<<< HEAD
//        LoggerFactory loggerFactory = new FileLoggerFactory();
        LoggerFactory loggerFactory = (LoggerFactory) XMLUtil.getBean();
=======
        LoggerFactory loggerFactory = new FileLoggerFactory();
>>>>>>> 0acff3787d0464502e5be15de5fa700f6d3e6485
        Logger logger = loggerFactory.createLogger();
        logger.writeLog();
    }
}
