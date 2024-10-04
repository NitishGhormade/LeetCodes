class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = weights[0];
        for(int weight: weights){
            sum += weight;
            if(max < weight){
                max = weight;
            }
        }

        int l = max;
        int r = sum;
        int minWeight = sum;

        while(l <= r){
            int mid = (l + r)/2;

            int tmpD = days;
            sum = 0;
            int i;
            for(i = 0;i < weights.length;i++){
                sum += weights[i];
                if(sum > mid){
                    sum = weights[i];
                    tmpD--;

                    if(tmpD == 0){
                        break;
                    }
                }
            }
            
            if(tmpD == 0 && i < weights.length){
                l = mid + 1;
            }
            else if(tmpD > 0 && i == weights.length){
                minWeight = mid;
                r = mid - 1;
            }
        }

        return minWeight;
    }
}