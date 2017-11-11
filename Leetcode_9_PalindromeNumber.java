
public class Leetcode_9_PalindromeNumber {
	public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int result = 0;
        while(x > result){
            result = (result * 10) + (x % 10);
            x = x / 10;
        }
        return x == result || x == result / 10;
    }
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Leetcode_9_PalindromeNumber l = new Leetcode_9_PalindromeNumber();
		System.out.println(l.isPalindrome(123454321));
	}
}