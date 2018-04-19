package thread.producerconsumer;

/**
 * @author:cheunyu
 * @date:2018/4/20 3:57
 */
public class ProConApp{

    public static void main(String[] args) {
        Info info = new Info(0);
        Runnable producer = new Producer(info);
        Runnable consumer = new Consumer(info);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(producer);
        Thread t3 = new Thread(producer);
        Thread t4 = new Thread(producer);
        Thread t5 = new Thread(producer);
        Thread t6 = new Thread(consumer);
        Thread t7 = new Thread(consumer);
        Thread t8 = new Thread(consumer);
        Thread t9 = new Thread(consumer);
        Thread t10 = new Thread(consumer);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
//        t8.start();
//        t9.start();
//        t10.start();
    }
}
