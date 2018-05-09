package proxy.staticproxy;

/**
 * Created by foo on 2018/3/28.
 */
public class Proxy implements Subject{

    Subject realSubject;

    public Proxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("proxy before doSomthing");
        realSubject.request();
        System.out.println("proxy after doSomthing");
    }
}
