package thread.synchronize;

/**
 * @author:cheunyu
 * @date:2018/4/18 5:05
 */
public class SynchronizedApp {

    public static void main(String[] args) {
        Runnable r1 = new SynchronizedExample();
        Thread t1 = new Thread(r1, "线程1");
        Thread t2 = new Thread(r1, "线程2");
        Thread t3 = new Thread(r1, "线程3");
        t1.start();
        t2.start();
        t3.start();
    }
}
