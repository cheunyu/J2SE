package audition.example1;

/**
 * Created by xiaoy on 2018/3/21.
 */
public abstract class Product {

    private String productName;
    private Double productPrice;

    public Product() {
    }

    public Product(String productName, Double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }
}
