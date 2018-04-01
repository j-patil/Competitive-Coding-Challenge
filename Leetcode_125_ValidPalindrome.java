class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        if(n == 0) return true;
        char c, d;
        for(int i= 0, j= n-1; i<j;){
            c = s.charAt(i);
            if(!Character.isLetterOrDigit(c)){
                i++; continue;
            }
            
            d = s.charAt(j);
            if(!Character.isLetterOrDigit(d)){
                j--; continue;
            }
            
            if(Character.toLowerCase(c) != Character.toLowerCase(d)) return false; 
            else {
                i++; j--;
            }
        }
        return true;
    }
}