class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;

        while(right < nums.length){
            if(nums[right] != 0){
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
            }
            right++;
        }
    }
}