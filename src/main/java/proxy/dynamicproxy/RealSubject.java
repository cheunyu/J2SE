package proxy.dynamicproxy;


/**
 * Created by foo on 2018/3/28.
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("real subject");
    }

    @Override
    public void otherMethod(int a) {
        System.out.println("other method :" + a);
    }
}
