class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;;
        for(int price: prices) {
            profit = Integer.max(profit, price - min);
            if(price < min) {
                min =price;
            }
        }
        return profit;
    }
}
