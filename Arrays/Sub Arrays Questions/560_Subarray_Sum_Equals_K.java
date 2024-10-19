class Solution {
    public int subarraySum(int[] nums, int k) {
        int cntArr = 0;

        HashSet<Integer> set = new HashSet<>();
        set.add(0);

        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];


            if(set.contains(sum - k) == true){
                cntArr++;
            }
            
            set.add(sum);
        }

        return cntArr;
    }
}