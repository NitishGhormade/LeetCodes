// TLE Error

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            Solution obj = new Solution();
            String ans = obj.betterString(str1, str2);
            System.out.println(ans);
        }
    }
}
// Driver Code Ends


// User function Template for Java

class Solution {
    static void genSubs(HashSet<String> set, String s, String current, int startIdx){
        set.add(current);
        if(startIdx == s.length()){
            return;
        }
        
        for(int i = startIdx;i < s.length();i++){
            current = current + s.charAt(i);
            if(set.contains(current) == false){
                genSubs(set, s, current, i + 1);
            }
            
            current = current.substring(0, current.length() - 1);
        }
    }
    
    public static String betterString(String str1, String str2) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        
        genSubs(set1, str1, "", 0);
        genSubs(set2, str2, "", 0);
        
        if(set1.size() == set2.size()){
            return str1;
        }
        else if(set1.size() > set2.size()){
            return str1;
        }
        else{
            return str2;
        }
    }
}