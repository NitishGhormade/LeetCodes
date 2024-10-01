class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i = 1;i < piles.length;i++){
            if(max < piles[i]){
                max = piles[i];
            }
        }

        int l = 1;
        int r = max;
        int k = max;

        while(l <= r){
            int mid = (l + r)/2;
            int sumHrs = 0;

            for(double num: piles){
                sumHrs += Math.ceil(num/mid);
            }

            if(sumHrs <= h){  // Lower Bound Similar Logic Condition. 
                if(mid < k){
                    k = mid;
                }
                r = mid - 1;
            }
            else if(sumHrs > h){
                l = mid + 1;
            }
        }

        return k;
    }
}