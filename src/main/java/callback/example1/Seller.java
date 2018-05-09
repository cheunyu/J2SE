package callback.example1;

/**
 * Created by foo on 2018/3/27.
 */
public class Seller {

    private String name;

    public Seller(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Bussiness implements DoJob{

        @Override
        public void fillBlank(int a, int b, int result) {
            System.out.printf(name + "计算:" + a + "+" + b + "=" + result);
        }
    }

    public void callHelp(int a, int b) {
        new Calculator().add(a, b, new Bussiness());
    }
}
