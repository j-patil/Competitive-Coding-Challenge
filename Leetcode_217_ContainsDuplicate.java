class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i=0; i< nums.length; i++){
            if(s.add(nums[i]) == false) return true;
        }
        return false;
    }
}