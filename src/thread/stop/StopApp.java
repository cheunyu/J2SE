package thread.stop;

/**
 * @author:cheunyu
 * @date:2018/4/16 17:32
 */
public class StopApp {

    public static void main(String[] args) throws InterruptedException {
        Runnable stopExample = new StopExample(true);
        Thread stopThread = new Thread(stopExample);
        stopThread.start();
        Thread.sleep(5000);
        ((StopExample) stopExample).stop();
    }
}
