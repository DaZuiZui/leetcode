import java.util.Arrays;

public class P2706 {
    public static void main(String[] args) {

    }

    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if (prices[0] + prices[1] == money){
            return 0;
        }

        return money - prices[1] - prices[0];
    }
}
