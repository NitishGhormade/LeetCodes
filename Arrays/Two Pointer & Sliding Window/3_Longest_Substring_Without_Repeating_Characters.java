class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;

        int l = 0;
        int r = 0;
        Map<Character, Integer> mp = new HashMap<>();
        while(r < s.length()){
            if(mp.get(s.charAt(r)) == null){
                mp.put(s.charAt(r), r);
            }
            else{
                if(mp.get(s.charAt(r)) < l){
                    mp.put(s.charAt(r), r);
                }
                else{
                    l = mp.get(s.charAt(r)) + 1;
                    mp.put(s.charAt(r), r);
                }
            }

            if(r - l + 1 > maxlen){
                maxlen = r - l + 1;
            }

            r += 1;
        }
        return maxlen;
    }
}