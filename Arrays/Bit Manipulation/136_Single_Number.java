class Solution {
    public int xor(int[] nums,int n){
        if(n == 0){
            return nums[n];
        }
        return nums[n] ^ xor(nums,n - 1);
    }
    public int singleNumber(int[] nums) {
        return xor(nums,nums.length - 1);
    }
}