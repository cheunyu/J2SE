package thread.yield;

/**
 * @author:cheunyu
 * @date:2018/4/15 17:25
 */
public class YieldExample {

    public static void main(String[] args) {
        Runnable tA = new RunnableExample("Thread A");
        Runnable tB = new RunnableExample("Thread B");
        Thread t3 = new ThreadExample("Thread C");
        Thread t1 = new Thread(tA);
        Thread t2 = new Thread(tB);
        t1.start();
        t2.start();
        t3.start();
    }
}
