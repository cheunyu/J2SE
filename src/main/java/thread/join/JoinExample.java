package thread.join;

import thread.runnable.RunnableExample;

/**
 * @author:cheunyu
 * @date:2018/4/15 17:17
 */
public class JoinExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        Runnable tA = new RunnableExample("线程A");
        Runnable tB = new RunnableExample("线程B");
        Thread t1 = new Thread(tA);
        Thread t2 = new Thread(tB);
        t1.start();
        t2.start();
        //把t1,t2线程加入到当前main主线程里，合并为顺序执行的线程，等t1,t2线程结束后继续执行main
        t1.join();
        t2.join();
        System.out.println("main end");
    }
}
