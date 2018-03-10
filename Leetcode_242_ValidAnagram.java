class Solution {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> m = new HashMap<>();
        
        char sc[] = s.toCharArray();
        char tc[] = t.toCharArray();
        int sc_len = sc.length;
        int tc_len = tc.length;
        if(sc_len == 0 && tc.length == 0) return true;
        if(sc_len != tc_len) return false;
        for(int i=0; i<sc_len; i++){
            if(!m.containsKey(sc[i])){
                m.put(sc[i], 1);
            }else{
                m.put(sc[i], m.get(sc[i])+1);
            }
        }
        
        for(int i=0; i<tc_len; i++){
            if(!m.containsKey(tc[i])){
                return false;
            }else{
                m.put(tc[i], m.get(tc[i])-1);
            }
        }
        
        ArrayList<Integer> a = new ArrayList<>(m.values());
        Iterator<Integer> i = a.iterator();
        while(i.hasNext()){
        	if((Integer)i.next() != 0) return false;
        }
        return true;
    }
}