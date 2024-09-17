/*

The Smallest Permutation is in INCREASING Order and Last Permutation is in DECREASING Order.

To get a Next Greater Permutation :- 
1. Find the Longest Dip :- Iterate from R to L and find a[i] < a[i + 1] :- That i is idx

2. Replace that idx with its Slightly Greater :- Iterate R to L and find a[idx] < a[i] :- Swap these two

3. Reverse the Elements after idx to get JUST SLIGHTLY Greater Permutation.

*/

class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        
        // Find Longest Dip
        for(int i = n - 2;i >= 0;i--){
            if(nums[i] < nums[i + 1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            // Array is in DECREASING Order so REVERSE to make it in INCREASING Order.
            for(int i = 0;i <= (0 + n - 1)/2;i++){
                int tmp = nums[i];
                nums[i] = nums[n - 1 - i];
                nums[n - 1 - i] = tmp;
            }
        }
        else{
            // Swap idx and its JUST GREATER
            for(int i = n - 1;i > idx;i--){
                if(nums[idx] < nums[i]){
                    int tmp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = tmp;
                    break;
                }
            }

            // Reverse elements after idx
            int cnt = 0;
            for(int i = idx + 1;i <= (idx + 1 + n - 1)/2;i++){
                int tmp = nums[i];
                nums[i] = nums[n - 1 - cnt];
                nums[n - 1 - cnt] = tmp;
                cnt++;
            }
        }

    }
}