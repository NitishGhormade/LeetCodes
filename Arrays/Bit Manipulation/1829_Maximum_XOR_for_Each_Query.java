// Optimal Solution, Time Complexity: O(n), Space Complexity: O(n)
// justLessThanMaxNum has all 1's in binary representation so :- justLessThanMaxNum - xor = A Number with 1's in binary where the XOR Number doesn't have 1's.
class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] ans = new int[nums.length];

        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        int justLessThanMaxNum = (int)Math.pow(2, maximumBit) - 1;
        int idx = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int k = justLessThanMaxNum - xor;

            ans[idx++] = k;
            xor ^= nums[i];
        }

        return ans;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Developing the Value of k Step by Step from the XOR. Better Solution. Time Complexity: O( n * (totalBits - 1) )
class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] ans = new int[nums.length];

        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        int maxNum = (int)Math.pow(2, maximumBit);
        int totalBits = (int)Math.floor(Math.log(maxNum) / Math.log(2)) + 1;
        totalBits -= 1;

        int idx = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int k = 0;

            for(int j = 0;j < totalBits;j++){
                if( (xor & (1 << j)) == 0 ){
                    k += Math.pow(2, j);
                }
            }

            ans[idx++] = k;
            xor ^= nums[i];
        }

        return ans;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////

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