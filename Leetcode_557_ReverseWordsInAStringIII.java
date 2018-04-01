class Solution {
    public String reverseWords(String s) {
        if(s.length() == 0 || s.length()== 1) return s;
        StringBuffer sb = new StringBuffer(s);
        Character c = ' ';
        sb.append(c);
        int temp = 0, l = sb.length();
        for(int k =0; k < l; k++){
            if(sb.charAt(k) == ' ' || k == l){
                for(int i= temp, j= k-1; i<j; i++, j--){
                    c = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j)); 
                    sb.setCharAt(j, c);
                }
                temp = k+1;
            }
        }
        sb.deleteCharAt(l-1);
        return String.valueOf(sb);
    }
}