package callback.example1;

/**
 * Created by foo on 2018/3/27.
 */
public class Client {

    public static void main(String[] args) {
        Student stu = new Student("小明");
        Seller seller = new Seller("商人");
        stu.callHelp(1, 2);
        seller.callHelp(1233, 23232);
    }
}
