package pattern.simple.factory;

/**
 * Created by xiaoy on 2018/3/19.
 */
public class LineChart implements Chart{

    public LineChart(){
        System.out.println("create linechart object");
    }
    @Override
    public void display() {
        System.out.println("display lineChart");
    }
}
