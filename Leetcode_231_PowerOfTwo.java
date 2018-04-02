class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1) return false;
        String s = Integer.toBinaryString(n);
        int count = 0;
        for(int i= 0; i< s.length(); i++){
            if(s.charAt(i) == '1') {
                if(count<1) count++;
                else return false;
            }
        }
        return count==1;
    }
}