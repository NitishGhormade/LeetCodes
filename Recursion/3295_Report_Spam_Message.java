class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> mp = new HashSet<>();

        for(String s: bannedWords){
            mp.add(s);
        }

        int cnt = 0;
        for(String s: message){
            if(mp.contains(s) == true){
                cnt++;
            }
        }

        if(cnt >= 2){
            return true;
        }
        return false;
    }
}