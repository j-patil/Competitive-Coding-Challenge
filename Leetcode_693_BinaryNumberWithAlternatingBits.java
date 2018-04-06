class Solution {
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        Character c = ' ';
        for(int i = 0; i< s.length(); i++){
            c = s.charAt(i);
            if(i==0) continue;
            else if(c == s.charAt(i-1)) return false;
        }
        return true;
    }
}