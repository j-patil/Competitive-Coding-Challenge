class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> s = new HashSet<>();
        int l = candies.length;
        for(int i=0; i<l; i++) s.add(candies[i]);
        int n = s.size();
        if(n<(l/2)) return n; else return l/2;
    }
}