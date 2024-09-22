/* 
    int lb = lowerBound();
    if(lb == -1 || nums[lb] != target) return new int[]{-1,-1};
    return new int[]{lb, upperBound() - 1};
*/

////////////////////////////////////////////////////////////////////////////////////////////////
//Due to the EQUALS Sign in IF at Line 19 and 40, we are getting the EXACT Index of that Num if it is Present.
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int pos = -1;

        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
            int mid = (l + r)/2;

            if(nums[mid] >= target){
                pos = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }

        if(pos == -1 || nums[pos] != target){
            return new int[]{-1,-1};
        }

        int[] ans = new int[2];
        ans[0] = pos;

        l = 0;
        r = nums.length - 1;
        while(l <= r){
            int mid = (l + r)/2;

            if(nums[mid] <= target){
                pos = mid;
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        ans[1] = pos;

        return ans; 
    }
}