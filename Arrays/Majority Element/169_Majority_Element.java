class Solution {
    public int majorityElement(int[] nums) {
        int num = nums[0];
        int cnt = 1;
        for(int i = 1;i < nums.length;i++){
            if(num == nums[i]){
                cnt += 1;
            }
            else{
                cnt -= 1;
            }
            if(cnt == 0){
                num = nums[i];
                cnt = 1;
            }
        }
        return num;
    }
}