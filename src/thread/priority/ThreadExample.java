package thread.priority;

/**
 * @author:cheunyu
 * @date:2018/4/18 2:40
 */
public class ThreadExample implements  Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<1000) {
            System.out.println(Thread.currentThread().getName() + " " + i++);
        }
    }
}
