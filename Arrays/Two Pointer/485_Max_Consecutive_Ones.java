class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCnt = 0;
        int tmpCnt = 0;

        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 1){
                tmpCnt++;
            }
            else{
                if(maxCnt < tmpCnt){
                    maxCnt = tmpCnt;
                }
                tmpCnt = 0;
            }
        }

        if(maxCnt < tmpCnt){
            maxCnt = tmpCnt;
        }

        return maxCnt;
    }
}