class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        
        int count = 1;
        int temp = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i]!=temp){
                temp = nums[i];
                nums[count++] = temp;
            }
        }
        return count;
    }
}