package proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created by foo on 2018/3/28.
 */
public class Clinet {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        ProxyHandle proxyHandle = new ProxyHandle(realSubject);
        Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces(), proxyHandle);
        proxySubject.request();
        proxySubject.otherMethod(100);
    }
}
