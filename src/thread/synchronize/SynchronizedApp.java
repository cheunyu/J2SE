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
        Thread t4 = new Thread(r1, "线程4");
        Thread t5 = new Thread(r1, "线程5");
        Thread t6 = new Thread(r1, "线程6");
        Thread t7 = new Thread(r1, "线程7");
        Thread t8 = new Thread(r1, "线程8");
        Thread t9 = new Thread(r1, "线程9");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
    }
}
