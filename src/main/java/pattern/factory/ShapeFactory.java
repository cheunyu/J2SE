package pattern.factory;

/**
 * Created by xiaoy on 2018/3/16.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null) {
            return null;
        }else if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
