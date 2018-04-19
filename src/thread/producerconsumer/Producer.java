package thread.producerconsumer;

/**
 * @author:cheunyu
 * @date:2018/4/20 3:51
 */
public class Producer implements Runnable {

    private Info info;

    public Producer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (info) {
                if (info.getCount() == 20) {
                    try {
                        System.out.println("========");
                        info.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                info.setCount(info.getCount() + 1);
                System.out.println("生产者生产，目前共有" + info.getCount());
//                info.notifyAll();
            }
        }

    }
}
