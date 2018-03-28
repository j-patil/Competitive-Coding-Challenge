class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String s: words){
            StringBuffer sb = new StringBuffer("");
            for(int i=0; i<s.length(); i++){
                sb.append(arr[s.charAt(i)-'a']);
            }
            set.add(String.valueOf(sb));
        }
        return set.size();
    }
}