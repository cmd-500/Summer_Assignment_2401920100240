package Week_1.Day_1;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Rename class to "Solution" before submitting to LeetCode


class BestTimetoBuyAndSellStock_0121 {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}
