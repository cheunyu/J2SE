package pattern.singleton.iodh;

/**
 * @author:cheunyu
 * @date:2018/4/21 1:03
 */
public class IodhSingleton {

    private IodhSingleton() {

    }

    private static class HolderClass {

        private static final IodhSingleton iodhSingleton = new IodhSingleton();
    }

    public static IodhSingleton getInstance() {
        return HolderClass.iodhSingleton;
    }
}
