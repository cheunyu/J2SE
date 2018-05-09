package pattern.factory;

/**
 * Created by xiaoy on 2018/3/16.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape circle = sf.getShape("Circle");
        circle.draw();
    }
}
