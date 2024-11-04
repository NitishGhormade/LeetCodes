// O(n) time complexity
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        
        return (s + s).contains(goal);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////

// O( n^2 ) time complexity
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        for(int i = 0;i < s.length();i++){
            int j;
            for(j = 0;j < goal.length();j++){
                if(s.charAt((i + j) % s.length()) != goal.charAt(j)){
                    break;
                }
            }

            if(j == goal.length()){
                return true;
            }
        }
        return false;
    }
}