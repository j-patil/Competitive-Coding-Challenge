class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        int left, right, fb = flowerbed.length;
        for(int i=0; i<fb; i++){
            if(i==0) left = 0; else left = flowerbed[i-1];
            if(i==fb-1) right = 0; else right = flowerbed[i+1];
            if((flowerbed[i]==0) && (left==0) && (right==0)) { flowerbed[i]=1; n--; if(n==0) return true; else continue;}
        }
        return false;
    }
}