package audition.example1;

/**
 * Created by xiaoy on 2018/3/21.
 */
public class ProductFace extends Product{

    private Integer ProductCount;

    public ProductFace() {
    }

    public ProductFace(String productName, Double productPrice, Integer productCount) {
        super(productName, productPrice);
        ProductCount = productCount;
    }



}
