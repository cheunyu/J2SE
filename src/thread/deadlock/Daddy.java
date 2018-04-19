package thread.deadlock;

/**
 * @author:cheunyu
 * @date:2018/4/20 2:14
 */
public class Daddy {

    public void condition() {
        System.out.println("考得好才给钱");
    }

    public void pay() {
        System.out.println("给钱了");
    }
}
