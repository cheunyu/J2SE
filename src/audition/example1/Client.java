package audition.example1;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Created by xiaoy on 2018/3/21.
 */
public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User aUser = new User();
        System.out.println("姓名");
        if(sc.hasNextLine()) {
            String userName = sc.nextLine();
            aUser.setName(userName);
        }
        System.out.println("账户余额");
        if(sc.hasNextLine()) {
            String balance = sc.nextLine();
            aUser.setBalance(Double.parseDouble(balance));
        }
        Deal deal = new Deal();
        if(aUser.getBalance()>=Card.GOLD_CARD_PRICE) {
            System.out.println("购买金卡 y/n？");
            if(sc.hasNextLine()) {
                String result = sc.nextLine();
                if(result.equalsIgnoreCase("y")) {
                    deal.buy(aUser, new GoldCard());
                    System.out.println("账户余额"+aUser.getBalance());
                    Card card = (GoldCard)aUser.getCard();
                    System.out.println("储值卡余额"+card.getCardBalance());

                }
            }
        }else if(aUser.getBalance()>=Card.SILVER_CARD_PRICE) {
            System.out.println("购买银卡 y/n？");
            if(sc.hasNextLine()) {
                String result = sc.nextLine();
                if(result.equalsIgnoreCase("y")) {
                    deal.buy(aUser, new SilverCard());
                    System.out.println("账户余额"+aUser.getBalance());
                    Card card = (SilverCard)aUser.getCard();
                    System.out.println("储值卡余额"+card.getCardBalance());
                }
            }
        }

    }
}
