class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int n1 = num1.length()-1;
        if(n1 == -1) return num2;
        int n2 = num2.length()-1;
        if(n2 == -1) return num1;
        int fdigit = 0, sdigit = 0, carry = 0;
        
        for(int i = n1, j = n2;;){
            fdigit = (i> -1 && fdigit != -1) ? num1.charAt(i) - '0' : 0;
            sdigit = (j> -1 && sdigit != -1) ? num2.charAt(j) - '0' : 0;
            carry += fdigit + sdigit;
            sb.insert(0, carry%10);
            carry /= 10;
            if(i>-1) i--;
            if(j>-1) j--;
            if((i==-1) && (j==-1)) break;
        }
        if(carry!=0) sb.insert(0, carry);
        return sb.toString();
    }
}