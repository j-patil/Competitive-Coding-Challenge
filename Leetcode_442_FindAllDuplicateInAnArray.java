class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            int temp = nums[i];
            if(temp<0) temp = Math.abs(temp);
            if(nums[temp-1]<0) l.add(temp);
            else nums[temp-1] *= -1;
        }
        return l;
    }
}