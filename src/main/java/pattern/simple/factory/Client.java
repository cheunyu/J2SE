package pattern.simple.factory;

/**
 * Created by xiaoy on 2018/3/19.
 */
public class Client {

    public static void main(String args[]) {
        Chart chart = ChartFactory.getChart("linechart");
        chart.display();
    }
}
