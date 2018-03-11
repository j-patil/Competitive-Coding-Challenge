class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> m = new LinkedHashMap<>();
        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            if(m.containsKey(c)) m.put(c, -1);
            else m.put(c, i);
        }
        
        List<Integer> l = new ArrayList<>(m.values());
        for(int j = 0; j<l.size(); j++){
            if(l.get(j)>-1)
                return l.get(j);
        }
        return -1;
    }
}