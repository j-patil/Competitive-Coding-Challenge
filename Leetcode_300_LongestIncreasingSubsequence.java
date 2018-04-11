class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        int len = 0, j = 0;
        // For loop(n)
        for(int i = 0; i< nums.length; i++){
            // Binary Search (Log n)
            // j represents the number where the element is found or where the should be placed.
            j = Arrays.binarySearch(dp, 0, len, nums[i]);
            if(j<0) j = -(j+1);
            // Here we place the element at that location. Remember the if the element was greater, j would be greater
            dp[j] = nums[i];
            if(len == j) len++;
        }
        return len;
    }
}