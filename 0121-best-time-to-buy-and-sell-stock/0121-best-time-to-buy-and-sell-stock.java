class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for(int i = 0; i < prices.length; i++)
        {
            minPrice = Math.min(minPrice, prices[i]);
            int diff = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, diff);
        }

        return maxProfit;
    }
}