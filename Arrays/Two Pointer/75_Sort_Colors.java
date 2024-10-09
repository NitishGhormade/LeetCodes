class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int help0 = -1;
        int help2 = n;

        for(int i = 0;i < n;i++){
            if(nums[i] == 0){
                help0++;
                nums[i] = nums[help0];
                nums[help0] = 0;
            }
        }

        for(int i = n - 1;i >= 0 && nums[i] != 0;i--){
            if(nums[i] == 2){
                help2--;
                nums[i] = nums[help2];
                nums[help2] = 2;
            }
        }
    }
}