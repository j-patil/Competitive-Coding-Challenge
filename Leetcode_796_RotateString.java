class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length() != B.length()) return false;
        if((B+B).contains(A)) return true; else return false;
    }
}