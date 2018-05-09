package proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created by foo on 2018/3/28.
 */
public class Clinet {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        ProxyHandle proxyHandle = new ProxyHandle(realSubject);
        Subject proxySubject = (Subject) Proxy.newProxyInstance(ProxyHandle.class.getClassLoader(), realSubject.getClass().getInterfaces(), proxyHandle);
        proxySubject.request();
        proxySubject.otherMethod(100);
    }
}
