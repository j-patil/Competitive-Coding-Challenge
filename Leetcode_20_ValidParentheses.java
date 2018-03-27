class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i< s.length(); i++) {
            Character c = s.charAt(i);
            switch(c) {
            case '(':
            case '[':
            case '{': st.push(c); break;
            case ')': if(st.empty()) return false; else if (st.peek() == '(') {st.pop(); break;} else return false;
            case ']': if(st.empty()) return false; else if (st.peek() == '[') {st.pop(); break;} else return false;
            case '}': if(st.empty()) return false; else if (st.peek() == '{') {st.pop(); break;} else return false;
            default: return false;
            }
        }
        return st.empty();
    }
}