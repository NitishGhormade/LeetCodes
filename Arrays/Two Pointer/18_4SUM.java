class Solution {

    static void threeSum(List<List<Integer>> ls, int l, int[] nums, int target) {
        int i = l + 1;

        while(i <= nums.length - 3){
            int j = i + 1;
            int k = nums.length - 1;

            while(j < k){
                long sum = (long)nums[l] + (long)nums[i] + (long)nums[j] + (long)nums[k];

                if(sum == target){
                    System.out.println(sum);
                    ArrayList<Integer> current = new ArrayList<>();
                    current.add(nums[l]);
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
                else if(sum < target){
                    j++;
                }
                else if(sum > target){
                    k--;
                }
            }

            while(i < nums.length - 3 && nums[i] == nums[i + 1]){
                i++;
            }
            i++;
        }
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ls = new ArrayList<>();

        Arrays.sort(nums);

        int l = 0;
        while(l <= nums.length - 4){
            threeSum(ls, l, nums, target);

            while(l < nums.length - 4 && nums[l] == nums[l + 1]){
                l++;
            }
            l++;
        }

        return ls;
    }
}