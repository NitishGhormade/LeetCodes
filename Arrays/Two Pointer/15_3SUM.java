// Backtracking solution
class Solution {

    static void threeSum(List<List<Integer>> ls, ArrayList<Integer> current, int[] nums, int startIdx, int sum){
        // base case
        if(current.size() == 3){
            if(sum == 0){
                ls.add(new ArrayList<>(current));
            }
            return;
        }

        for(int i = startIdx;i < nums.length;i++){
            current.add(nums[i]);

            if(i > startIdx && nums[i - 1] == nums[i]){}
            else{
                threeSum(ls, current, nums, i + 1, sum + nums[i]);
            }

            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();

        Arrays.sort(nums);

        threeSum(ls, new ArrayList<Integer>(), nums, 0, 0);

        return ls;
    }
}