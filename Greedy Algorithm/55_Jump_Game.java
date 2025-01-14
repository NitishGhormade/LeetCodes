class Solution {
    public boolean canJump(int[] nums) {
        int maxIdx = 0;

        for(int i = 0;i < nums.length && i <= maxIdx;i++){
            maxIdx = Math.max(maxIdx, i + nums[i]);

            if(maxIdx >= nums.length - 1){
                return true;
            }
        }
        return false;
    }
}