package audition.example1;

/**
 * Created by xiaoy on 2018/3/21.
 */
public abstract class Card extends Product{

    public static final Double GOLD_CARD_PRICE = 2000d;
    public static final Double SILVER_CARD_PRICE = 1000d;
    public Double cardBalance;

    public Card() {
    }

    public Card(Double cardBalance, String productName) {
        this.cardBalance = cardBalance;
        this.setProductName(productName);
    }

    public Double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(Double cardBalance) {
        this.cardBalance = cardBalance;
    }
}
