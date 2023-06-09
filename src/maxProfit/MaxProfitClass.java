package maxProfit;

/**
 * MaxProfitClass
 * <p>
 * Description goes here.
 * <p>
 * Created by arsendeputat on 07.06.2023.
 */
public class MaxProfitClass implements MaxProfit{
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int profit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                if (prices[right] - prices[left] > profit) {
                    profit = prices[right] - prices[left];
                }
            } else {
                left = right;
            }
            right++;
        }
        return profit;
    }
}
