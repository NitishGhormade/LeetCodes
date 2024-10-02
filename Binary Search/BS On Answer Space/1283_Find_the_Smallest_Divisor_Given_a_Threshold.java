class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = nums[0];
        for(int num: nums){
            if(max < num){
                max = num;
            }
        }

        int l = 1;
        int r = max;
        int divisor = max;

        while(l <= r){
            int mid = (l + r)/2;

            int sum = 0;
            for(double num: nums){
                sum += Math.ceil(num/mid);
            }

            if(sum > threshold){
                l = mid + 1;
            }
            else{
                divisor = mid;
                r = mid - 1;
            }
        }

        return divisor;
    }
}