class Solution {
    public int maxProfit(int[] prices) {
        int current = 0;
        for(int i = 1; i<prices.length; i++){
            int diff = prices[i] - prices[i-1];
            if(diff > 0) current += (prices[i] - prices[i-1]);
        }
        return current;
    }
}