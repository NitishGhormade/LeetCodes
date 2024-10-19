class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();

        int cnt1 = 0, cnt2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;

        for(int i = 0;i < nums.length;i++){
            if(cnt1 == 0 && nums[i] != ele2){
                ele1 = nums[i];
                cnt1 = 1;
            }
            else if(cnt2 == 0 && nums[i] != ele1){
                ele2 = nums[i];
                cnt2 = 1;
            }
            else if(ele1 == nums[i]){
                cnt1++;
            }
            else if(ele2 == nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for(int num: nums){
            if(num == ele1){
                cnt1++;
            }
            else if(num == ele2){
                cnt2++;
            }
        }

        int minimum = (nums.length/3) + 1;
        if(cnt1 >= minimum){
            ls.add(ele1);
        }
        if(cnt2 >= minimum){
            ls.add(ele2);
        }

        return ls;
    }
}