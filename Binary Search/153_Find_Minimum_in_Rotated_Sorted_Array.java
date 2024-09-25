class Solution {
    public int findMin(int[] nums) {
        int min = 5000;

        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
            int mid = (l + r)/2;

            if(nums[mid] < min){
                min = nums[mid];
            }
            
            if(nums[l] <= nums[mid]){
                if(nums[l] < min){
                    min = nums[l];
                }
                l = mid + 1;
            }
            else if(nums[mid] <= nums[r]){
                r = mid - 1;
            }
        }

        return min;
    }
}