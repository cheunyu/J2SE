package pattern.simple.factory;

/**
 * Created by xiaoy on 2018/3/19.
 */
public class PieChart implements Chart{
    public PieChart() {
        System.out.println("create piechart object");
    }
    @Override
    public void display() {
        System.out.println("display pieChart");
    }
}
