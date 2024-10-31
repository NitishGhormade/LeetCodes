class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen = 0;
        int cntZ = 0;

        int l = 0;
        int r = 0;

        while(r < nums.length){
            if(nums[r] == 0){
                cntZ++;
            }

            if(cntZ <= k){
                maxlen = Math.max(maxlen, r - l + 1);
            }
            else{
                if(nums[l] == 0){
                    cntZ--;
                }
                l++;
            }

            r++;
        }

        return maxlen;
    }
}