class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        for(int i=2; i<n; i++){
            cost[i] = cost[i] + Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[n-2], cost[n-1]);
    }
}