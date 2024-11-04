class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();

        int cnt = 1; // Count of Letter in WORD
        char ch = word.charAt(0); // Current character to which the count needed to be found

        for(int i = 1;i < word.length();i++){
            if(ch == word.charAt(i)){
                cnt++;

                if(cnt > 9){
                    comp.append(9).append(ch);
                    cnt = 1;
                }
            }
            else{
                comp.append(cnt).append(ch);
                cnt = 1;
                ch = word.charAt(i);
            }
        }
        comp.append(cnt).append(ch);

        return comp.toString();
    }
}