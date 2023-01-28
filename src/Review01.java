
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        int taxPrice = tax(price, 10);
        System.out.println( price + "円の商品の税込価格は" + (price + taxPrice) + "円（消費税は" + taxPrice + "円）です。");
    }

    public static int tax(int price, int percent) {
        int result = price * percent / 100;
        return result;
    }

    }

