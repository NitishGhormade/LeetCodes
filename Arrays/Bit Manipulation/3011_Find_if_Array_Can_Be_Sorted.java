// We have to Sort the Array :- By Swapping the Adjacent Elements so the use Bubble Sort.
class Solution {
    static int setBits(int num){
        int cnt = 0;
        for(int i = 0;i <= 8;i++){
            if(((num >> i) & 1) == 1) cnt++;
        }

        return cnt;
    }

    public boolean canSortArray(int[] nums) {
        for(int i = 1;i < nums.length;i++){
            for(int j = 0;j <= nums.length - 1 - i;j++){
                if(nums[j] > nums[j+1]){ 
                    if(setBits(nums[j]) == setBits(nums[j+1])){
                        int tmp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = tmp;
                    }
                    else return false;
                }
            }
        }
        return true;
    }
}