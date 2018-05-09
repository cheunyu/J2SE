package thread;

/**
 * @author:cheunyu
 * @date:2018/4/15 16:24
 */
public class ThreadExample extends Thread{

    private String name;

    public ThreadExample(String name) {
        this.name = name;
    }

    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println(name + ": " + i);
        }
    }
}
