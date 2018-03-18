class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(s.add(n)){
          int res = 0;
          while(n > 0){
            res += Math.pow(n%10,2);
            n = n/10;   
        }
            n = res;
            if(res == 1) return true;
        }
        return false;
    }
}