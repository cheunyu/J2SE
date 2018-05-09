package thread.priority;

/**
 * @author:cheunyu
 * @date:2018/4/18 2:41
 */
public class PriorityApp {

    public static void main(String[] args) {
        Runnable r1 = new ThreadExample();
        Runnable r2 = new ThreadExample();
        Thread t1 =  new Thread(r1,"线程1");
        Thread t2 =  new Thread(r2,"线程2");
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
