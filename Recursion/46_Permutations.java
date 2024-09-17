class Solution {

    public static void generate(List<List<Integer>> result, ArrayList<Integer> ls, int[] nums){
        // base case
        if(ls.size() == nums.length){
            result.add(new ArrayList<Integer>(ls));
            return;
        }

        for(int i = 0;i < nums.length;i++){
            if(ls.contains(nums[i])){
                continue;
            }

            ls.add(nums[i]);
            generate(result, ls, nums);

            ls.remove(ls.size() - 1);
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generate(result, new ArrayList<>(), nums);
        return result;
    }
}