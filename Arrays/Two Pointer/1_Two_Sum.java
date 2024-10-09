import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i = 0;i < nums.length;i++){
            if(mp.get(target - nums[i]) != null){
                result[0] = mp.get(target - nums[i]);
                result[1] = i;
                break;
            }
            else{
                mp.put(nums[i],i);
            }
        }

        return result;
    }
}