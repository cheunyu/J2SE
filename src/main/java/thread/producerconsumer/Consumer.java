package thread.producerconsumer;

/**
 * @author:cheunyu
 * @date:2018/4/20 3:56
 */
public class Consumer implements Runnable {

    private Info info;

    public Consumer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (info) {
                while (info.getCount() == 0) {
                    try {
                        info.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                info.setCount(info.getCount() - 1);
                System.out.println("消费者消费，目前共有" + info.getCount());
                info.notifyAll();
            }
        }
    }
}
