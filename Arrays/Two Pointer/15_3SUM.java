// FOR Loop solution
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();

        Arrays.sort(nums);

        int i = 0;
        while(i <= nums.length - 3){
            int j = i + 1;
            int k = nums.length - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0){
                    ArrayList<Integer> current = new ArrayList<>();
                    current.add(nums[i]);
                    current.add(nums[j]);
                    current.add(nums[k]);
                    ls.add(current);

                    while(j < nums.length - 1 && nums[j] == nums[j + 1]){
                        j++;
                    }
                    j++;

                    while(k > 0 && nums[k - 1] == nums[k]){
                        k--;
                    }
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
            }

            while(i < nums.length - 3 && nums[i] == nums[i + 1]){
                i++;
            }
            i++;
        }

        return ls;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////

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
            if(i > startIdx && nums[i - 1] == nums[i]){}
            else{
                current.add(nums[i]);

                threeSum(ls, current, nums, i + 1, sum + nums[i]);
            
                current.remove(current.size() - 1);
            }
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();

        Arrays.sort(nums);

        threeSum(ls, new ArrayList<Integer>(), nums, 0, 0);

        return ls;
    }
}