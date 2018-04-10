package algorithm;

/**
 * Author:cheunyu
 * Date:2018/4/10 14:10
 */
public class Fibonacci {

    public static int f(int i){
        if(i<=2) {
            return i;
        }else {
            return Fibonacci.f(i-2) + Fibonacci.f(i-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.f(11));
    }
}
