package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by foo on 2018/3/28.
 */
public class ProxyHandle implements InvocationHandler{

    Subject subject;

    public ProxyHandle(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy:real subject before dosomthing");
        Object result = method.invoke(subject, args);
        System.out.println("proxy:real subject after dosomthing");
        return result;
    }
}
