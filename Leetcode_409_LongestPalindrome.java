class Solution {
    public int longestPalindrome(String s) {
        if (s == "") return 0;
        int arr[] = new int[52];
        char c = ' ';
        for(int i = 0; i< s.length(); i++){
            c = s.charAt(i);
            if(Character.isLowerCase(c)) arr[c-'a']++;
            else arr[(c - 'A') + 26]++;
        }
        int res = 0;
        for(int j = 0; j< 52; j++){
            res += (arr[j] / 2) * 2;
        }
        if (res == s.length()) return res; else return res+1;  
    }
}