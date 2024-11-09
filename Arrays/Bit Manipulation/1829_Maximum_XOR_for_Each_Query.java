// Brute Force, Time: O(n * (2 ^ maximumBit)), Space: O(n), Time Limit Exceeded
class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] ans = new int[nums.length];

        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        int maxNum = (int)Math.pow(2, maximumBit);
        int idx = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int max = 0;
            int maxK = 0;

            for(int k = 0;k < maxNum;k++){
                if(max < (k ^ xor)){
                    max = k ^ xor;
                    maxK = k;
                }
            }

            ans[idx++] = maxK;

            xor ^= nums[i];
        }

        return ans;
    }
}