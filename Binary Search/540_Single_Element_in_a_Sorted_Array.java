/*
    Before Single Element :- Equal Elements are First at EVEN and Second at ODD.
    After Single Element :- Equal Elements are First at ODD and Second at EVEN.
*/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 1;
        int r = nums.length - 2;

        int m = nums[0];

        if(nums.length == 1){
            return m;
        }
        else if(nums[0] != nums[1]){
            m = nums[0];
        }
        else if(nums[nums.length - 2] != nums[nums.length - 1]){
            m = nums[nums.length - 1];
        }
        else{
            while(l <= r){
                int mid = (l + r)/2;

                if(nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1]){
                    return nums[mid];
                }
                else if(nums[mid - 1] == nums[mid]){
                    if((mid - 1) % 2 == 0){
                        l = mid + 1;
                    }
                    else{
                        r = mid - 1;
                    }
                }
                else if(nums[mid] == nums[mid + 1]){
                    if((mid) % 2 == 0){
                        l = mid + 1;
                    }
                    else{
                        r = mid - 1;
                    }
                }
            }
        }

        return m;
    }
}