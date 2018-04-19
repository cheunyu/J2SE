package thread.deadlock;

/**
 * @author:cheunyu
 * @date:2018/4/20 2:18
 */
public class DeadLockExample implements Runnable{

    private static Daddy daddy = new Daddy();
    private static Son son = new Son();
    private boolean flag;

    public DeadLockExample(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (daddy) {
                System.out.println("daddy");
                daddy.condition();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (son) {
                    daddy.pay();
                }
            }

        }else {
            synchronized (son) {
                System.out.println("son");
                son.give();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (daddy) {
                    son.exam();
                }
            }
        }
    }

}
