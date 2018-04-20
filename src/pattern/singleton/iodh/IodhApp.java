package pattern.singleton.iodh;

/**
 * @author:cheunyu
 * @date:2018/4/21 1:06
 */
public class IodhApp {

    public static void main(String[] args) {
        System.out.println(IodhSingleton.getInstance());
        System.out.println(IodhSingleton.getInstance());
    }
}
