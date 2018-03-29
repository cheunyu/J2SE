package proxy.staticproxy;

/**
 * Created by foo on 2018/3/28.
 */
public class Client {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Proxy proxySubject = new Proxy(realSubject);
        proxySubject.request();
    }
}
