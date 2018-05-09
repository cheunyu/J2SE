package audition.example1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xiaoy on 2018/3/21.
 */
public class Order {

    public static Integer num = 1;
    private String orderNum;
    private Product product;
    private Integer productCount;
    private Date orderTime;

    public Order() {
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Order(Product product, Integer productCount, Date orderTime) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        this.orderNum = sdf.format(orderTime)+num++;
        this.product = product;
        this.productCount = productCount;
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "订单流水{" +
                "订单号:'" + orderNum + '\'' +
                ", 商品名称:" + product.getProductName() +
                ", 交易数量:" + productCount +
                ", 交易时间:" + orderTime +
                '}';
    }
}
