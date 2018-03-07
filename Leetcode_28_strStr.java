public class Common {
	
	public static int strStr(String haystack, String needle) {
        char[] hay = haystack.toCharArray();
        char[] nee = needle.toCharArray();
        
        int h = hay.length;
        int n = nee.length;
        
        if(h < n) return -1;
        if(n == 0) return 0;
        
        for (int i = 0; i < h; i++){
        	if (hay[i] == nee[0] && n==1) return 0;
            else if(hay[i] == nee[0]){
                    if ((h-i)<n) return -1;
        		    for(int j = 1; j < n; j++){
            		    if(hay[i+j] != nee[j]){break;}
            		    else if(j == n-1) return i;
            	}
        	}
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String haystack = "mississippi";
		String needle = "issip";
		System.out.println(strStr(haystack, needle));
		
	}
}