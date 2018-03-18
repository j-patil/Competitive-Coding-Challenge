class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        backtrack(nums, l, new ArrayList<Integer>(), 0);
        return l;
    }
    
    public void backtrack(int[] nums, List<List<Integer>> l, List<Integer> s, int current) {
        l.add(new ArrayList<>(s));
        for(int i = current; i < nums.length; i++){
            s.add(nums[i]);
            backtrack(nums, l, s, i+1);
            s.remove(s.size() - 1);
        }
    }
}