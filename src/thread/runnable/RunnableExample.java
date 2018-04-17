package thread.runnable;

/**
 * @author:cheunyu
 * @date:2018/4/15 16:37
 */
public class RunnableExample implements Runnable{

    private String name;

    public RunnableExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println(name + ": " + i);
        }
    }
}
