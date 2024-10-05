
// Brute Force Solution
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        boolean hasPermutation = false;
        if(s1.length() > s2.length()){
            hasPermutation = false;
        }
        else{
            int[] mp1 = new int[26];
            for(int i = 0;i < s1.length();i++){
                mp1[s1.charAt(i) - 'a']++;
            }

            int[] mp2 = Arrays.copyOf(mp1, mp1.length);

            int l = 0;
            int r = 0;
            while(r < s2.length()){
                if(mp2[s2.charAt(r) - 'a'] > 0){
                    mp2[s2.charAt(r) - 'a']--;
                    
                    if(r - l + 1 == s1.length()){
                        hasPermutation = true;
                        break;
                    }

                    r++;
                }
                else{
                    l++;
                    r = l;
                    mp2 = Arrays.copyOf(mp1, mp1.length);
                }
            }
        }

        return hasPermutation;
    }
}