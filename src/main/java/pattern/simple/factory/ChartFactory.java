package pattern.simple.factory;

/**
 * Created by xiaoy on 2018/3/19.
 */
public class ChartFactory {

    public static Chart getChart(String type) {
        Chart chart = null;
        if(type.equalsIgnoreCase("histogramchart"))  {
           chart = new HistogramChart();
        }else if (type.equalsIgnoreCase("linechart")) {
            chart = new LineChart();
        }else if (type.equalsIgnoreCase("piechart")) {
            chart = new PieChart();
        }
        return chart;
    }
}
