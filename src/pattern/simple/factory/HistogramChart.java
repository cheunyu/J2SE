package pattern.simple.factory;

/**
 * Created by xiaoy on 2018/3/19.
 */
public class HistogramChart implements Chart{

    public HistogramChart() {
        System.out.println("create histogramChart object");
    }
    @Override
    public void display() {
        System.out.println("display histogramChart");
    }

}
