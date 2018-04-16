class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int n = c.length;
        char ch = ' ';
        for(int i=0, j=n-1; i<j;){
            if(!set.contains(c[i])) { i++; continue; }
            if(!set.contains(c[j])) { j--; continue; }
            ch = c[i];
            c[i] = c[j];
            c[j] = ch;
            i++;
            j--;
        }
        return String.valueOf(c);
    }
}