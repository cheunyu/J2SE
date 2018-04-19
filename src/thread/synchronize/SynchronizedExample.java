package thread.synchronize;

/**
 * @author:cheunyu
 * @date:2018/4/18 5:04
 */
public class SynchronizedExample implements Runnable {
    private int tick = 1000;
    private boolean flag = true;
    @Override
    public void run() {
        while (flag) {
            try {
                buyTickSyn();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void buyTick() throws InterruptedException {
        if (tick <= 0 ) {
            flag = false;
            return;
        }
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName() + " tick -----> " + tick--);
    }

    public void buyTickSyn1() throws InterruptedException {
        synchronized (this) {
            if (tick <= 0 ) {
                flag = false;
                return;
            }
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName() + " tick -----> " + tick--);
        }
    }

    public synchronized void buyTickSyn() throws InterruptedException {
        if (tick <= 0 ) {
            flag = false;
            return;
        }
        Thread.sleep(10);
        System.out.println(Thread.currentThread().getName() + " tick -----> " + tick--);
    }
}
