package audition.example1;

import java.util.Date;

/**
 * Created by xiaoy on 2018/3/21.
 */
public class Deal {

    public void buy(User aUser, Product product){
        if(product instanceof GoldCard) {
            aUser.setBalance(aUser.getBalance() - GoldCard.GOLD_CARD_PRICE);
            product = new GoldCard();
            aUser.setCard(product);
            Order order = new Order(product,1,new Date());
            aUser.setOrderList(order);
            System.out.println(order.toString());

        }else if(product instanceof SilverCard) {
            aUser.setBalance(aUser.getBalance() - GoldCard.SILVER_CARD_PRICE);
            product = new SilverCard();
            aUser.setCard(product);
            aUser.setOrderList(new Order(product,1,new Date()));
        }
    }
}