class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxsum = 0;
        int sum = 0;
        int n = cardPoints.length;

        for(int i = 0;i < k;i++){
            sum += cardPoints[i];
        }

        int l = 0;
        for(int i = k - 1;i >= 0;i--){
            if(maxsum < sum){
                maxsum = sum;
            }

            sum -= cardPoints[i];
            
            l = (n + (l - 1)) % n;
            sum += cardPoints[l];
        }
        if(maxsum < sum){
            maxsum = sum;
        }

        return maxsum;
    }
}