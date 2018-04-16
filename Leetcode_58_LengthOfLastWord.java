class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        if(n<0) return 0;
        while((s.charAt(n) == ' ')) { if(n==0) return 0; n--; }
        for(int i = n; i>-1; i--){
            if(s.charAt(i)==' ') return n-i;
        }
        return n+1;
    }
}