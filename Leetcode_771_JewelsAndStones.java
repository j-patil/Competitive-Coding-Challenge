class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Map<Character, Integer> m = new HashMap<>();
        for(int i = 0; i< S.length(); i++){
            Character c = S.charAt(i);
            if(m.containsKey(c)) m.put(c, m.get(c)+1);
            else m.put(c, 1);
        }
        for(int j = 0; j< J.length(); j++){
            Character c = J.charAt(j);
            if(m.containsKey(c)) count += m.get(c);
        }
        return count;
    }
}