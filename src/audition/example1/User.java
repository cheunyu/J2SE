package audition.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by xiaoy on 2018/3/21.
 */
public class User {

    private String uuid;
    private String name;
    private Double balance;
    private Product card;
    private List<Order> orderList = new ArrayList<Order>();

    public User() {

    }

    public User(String name, Double balance, Card card, List<Order> orderList) {
        uuid = UUID.randomUUID().toString();
        this.name = name;
        this.balance = balance;
        this.card = card;
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(Order order) {
        this.orderList.add(order);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Product getCard() {
        return card;
    }

    public void setCard(Product card) {
        this.card = card;
    }
}
