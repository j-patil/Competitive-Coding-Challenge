class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        
        for(String i: strs){
        	char temp[] = i.toCharArray();
        	Arrays.sort(temp);
        	String res = String.copyValueOf(temp);
        	if(!m.containsKey(res))
        		m.put(res, new ArrayList<String>());
        		m.get(res).add(i);
        	}
        return new ArrayList<List<String>>(m.values());
    }
}