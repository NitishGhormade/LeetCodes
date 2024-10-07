class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        int len = s.length();

        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);

            if(ch == 'A') st.push(ch);
            
            else if(ch == 'C') st.push(ch);

            else if(ch == 'B' && st.isEmpty() == false && st.peek() == 'A'){
                st.pop();
                len -= 2;
            }
            else if(ch == 'D' && st.isEmpty() == false && st.peek() == 'C'){
                st.pop();
                len -= 2;
            }
            else{
                st.clear();
            }
        }

        return len;
    }
}