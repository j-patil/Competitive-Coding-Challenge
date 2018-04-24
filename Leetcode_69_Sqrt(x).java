class Solution {
    public int mySqrt(int x) {
        if((x==0) || (x==1)) return x;
        long temp = x;
        while(temp*temp > x){
            temp = (temp + x/temp)/2;
        }
        return (int)temp;
    }
}