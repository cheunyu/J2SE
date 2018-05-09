package proxy.staticproxy;

/**
 * Created by foo on 2018/3/28.
 */
public class RealSubject implements Subject{

    public RealSubject() {
    }

    @Override
    public void request() {
        System.out.println("real object");
    }

}
