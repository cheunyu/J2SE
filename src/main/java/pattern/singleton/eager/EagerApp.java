package pattern.singleton.eager;

/**
 * @author:cheunyu
 * @date:2018/4/21 0:21
 */
public class EagerApp {

    public static void main(String[] args) {
        System.out.println(EagerSingleton.getInstance());
        System.out.println(EagerSingleton.getInstance());
    }
}
