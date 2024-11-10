// Accepting but a BAD solution
class Solution {
    public long minEnd(int n, int x) {
        long first = x;
        long num = first;

        for(int i = 1;i < n;i++){
            num += 1;
            
            if((num & first) != first){
                num = num | first;
            }
        }

        return num;
    }
}