class Solution {
    static void genSubs(List<List<Integer>> ls, ArrayList<Integer> current, int[] nums, int startIdx){
        ls.add(new ArrayList(current));
        if(startIdx == nums.length){
            return;
        }

        for(int i = startIdx;i < nums.length;i++){
            current.add(nums[i]);
            if(i > startIdx && nums[i] == nums[i - 1]){

            }
            else{
                genSubs(ls, current, nums, i + 1);
            }

            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ls = new ArrayList<>();

        genSubs(ls, new ArrayList<Integer>(), nums, 0);

        return ls;
    }
}