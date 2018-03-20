class Solution {
    public boolean isPowerOfFour(int num) {
        if(num<1) return false;
        String binary = Integer.toBinaryString(num);
        int check = -1;
        int len = binary.length()-1;
        for(int i = len; i >= 0; i--){
            if(binary.charAt(i) == '1'){
                if(check > -1) return false; else check = i;
            }
        }
        return ((len-check)%2)==0;
    }
}