class Solution {
    public int findPeakElement(int[] nums) {
        int l = 1;
        int r = nums.length - 2;

        int peak = 0;

        if(nums.length == 1){
            peak = 0;
        }
        else if(nums[0] > nums[1]){
            peak = 0;
        }
        else if(nums[nums.length - 2] < nums[nums.length - 1]){
            peak = nums.length - 1;
        }
        else{
            while(l <= r){
                int mid = (l + r)/2;

                if(nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]){
                    return mid;
                }
                else if(nums[mid - 1] < nums[mid] && nums[mid] < nums[mid + 1]){
                    l = mid + 1;
                }
                else if(nums[mid - 1] > nums[mid] && nums[mid] > nums[mid + 1]){
                    r = mid - 1;
                }
                else if(nums[mid - 1] > nums[mid] && nums[mid] < nums[mid + 1]){ // Here i can go to LEFT or RIGHT its my choice, and there is NO RISK pointers CROSSING EACH OTHER.
                    l = mid + 1;
                }
            }
        }

        return peak;
    }
}