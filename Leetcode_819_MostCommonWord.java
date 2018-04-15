class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> s = new HashSet<>(Arrays.asList(banned));
        String[] p = paragraph.replaceAll("\\pP", "").toLowerCase().split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        String res = "";
        for(String i: p){
            if(!s.contains(i)){
                map.put(i, map.getOrDefault(i, 0)+1);
                if(map.get(i) > max){
                    res = i;
                    max = map.get(i);
                }
            }
        }
        return res;
    }
}