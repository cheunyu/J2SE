package callback.example1;

/**
 * Created by foo on 2018/3/27.
 */
public class Student{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int calcADD(int a, int b) {
        return a+b;
    }

    public void callHelp(int a, int b) {
        new Calculator().add(a, b, new HomeWork());
    }

    public class HomeWork implements DoJob {

        @Override
        public void fillBlank(int a, int b, int result) {
            System.out.println(name + "计算器" + a + "+" + b + "=" + result);
        }
    }
}
