package thread;

/**
 * @author:cheunyu
 * @date:2018/4/15 16:26
 */
public class ThreadClient {
    public static void main(String[] args) {
        Thread tA = new ThreadExample("线程A");
        Thread tB = new ThreadExample("线程B");
        Thread tC = new ThreadExample("线程C");
        tA.start();
        tB.start();
        tC.start();
    }
}
