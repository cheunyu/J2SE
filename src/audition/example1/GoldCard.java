package audition.example1;

/**
 * Created by xiaoy on 2018/3/21.
 */
public class GoldCard extends Card{

    public static final Double ALLOWANCE = 0.66d;

    public GoldCard() {
        super(Card.GOLD_CARD_PRICE,"储值金卡");
    }

    public static Double getALLOWANCE() {
        return ALLOWANCE;
    }
}
