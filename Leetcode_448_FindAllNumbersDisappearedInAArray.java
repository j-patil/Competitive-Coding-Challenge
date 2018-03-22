class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            int temp = Math.abs(nums[i])-1;
            nums[temp] = -1 * Math.abs(nums[temp]);
        }
        for(int j = 0; j< nums.length; j++){
            if(nums[j] > 0) l.add(j+1);
        }
        return l;
    }
}