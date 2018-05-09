package thread.runnable;

/**
 * @author:cheunyu
 * @date:2018/4/15 16:38
 */
public class RunnableClient {

    public static void main(String[] args) {
        RunnableExample t1 = new RunnableExample("线程A");
        RunnableExample t2 = new RunnableExample("线程B");
        RunnableExample t3 = new RunnableExample("线程C");
        Thread tA = new Thread(t1);
        Thread tB = new Thread(t2);
        Thread tC = new Thread(t3);
        tA.start();
        tB.start();
        tC.start();
    }
}
