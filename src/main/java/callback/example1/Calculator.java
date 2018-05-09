package callback.example1;

/**
 * Created by foo on 2018/3/27.
 */
public class Calculator {

    public void add(int a, int b, DoJob customer) {
        int result = a+b;
        customer.fillBlank(a, b, result);
    }
}
