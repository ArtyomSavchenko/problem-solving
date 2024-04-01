package org.example.tasks.array;

// O(N)
public class BestTimeToBuyAndSellSingle {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int diff = price - min;
            max = Math.max(diff, max);
            if (min > price) {
                min = price;
            }
        }

        return max;
    }
}
