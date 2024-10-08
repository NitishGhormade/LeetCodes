// Kendals Method :- MAX SUM SUBARRAY

class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;

        int start = -1;
        int end = -1;

        int tmpStart = -1;
        for(int i = 0;i < nums.length;i++){
            if(sum == 0){
                tmpStart = i;
            }

            sum += nums[i];

            if(maxsum < sum){
                maxsum = sum;
                start = tmpStart;
                end = i;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        return maxsum;
    }
}