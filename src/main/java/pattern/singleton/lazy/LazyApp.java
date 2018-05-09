package pattern.singleton.lazy;

/**
 * @author:cheunyu
 * @date:2018/4/20 9:00
 */
public class LazyApp {

    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
    }
}
