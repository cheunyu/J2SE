package thread.deadlock;

/**
 * @author:cheunyu
 * @date:2018/4/20 2:26
 */
public class DeadLockApp {

    public static void main(String[] args) {
        DeadLockExample r1 = new DeadLockExample(true);
        DeadLockExample r2 = new DeadLockExample(false);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

    }
}
