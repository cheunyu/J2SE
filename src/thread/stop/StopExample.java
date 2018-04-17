package thread.stop;

/**
 * @author:cheunyu
 * @date:2018/4/16 17:30
 */
public class StopExample implements Runnable{

    private boolean flag;

    public StopExample(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        this.flag = false;
    }
}
