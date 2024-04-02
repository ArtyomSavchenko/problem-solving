package org.example.tasks.array;

// O(N)
public class BestTimeToBuyAndSell2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int diff = price - min;
            if (diff > 0) {
                profit += diff;
                min = price;
            } else if (min > price) {
                min = price;
            }
        }

        return profit;
    }
}
