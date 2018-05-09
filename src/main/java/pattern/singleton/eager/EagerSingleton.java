package pattern.singleton.eager;

/**
 * @author:cheunyu
 * @date:2018/4/21 0:19
 */
public class EagerSingleton {

    private static final EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }
}
