class Solution {
    static int countCalc(int[] nums, int l, int mid, int r){
        int cnt = 0;
        int i = l;
        int j = mid + 1;

        while(i <= mid && j <= r){
            if(nums[i] > 2 * (long)nums[j]){
                cnt += mid - i + 1;
                j++;
            }
            else{
                i++;
            }
        }

        return cnt;
    }

    static int merge(int[] nums, int l, int mid, int r){
        // count generation
        int cnt = countCalc(nums, l, mid, r);

        // merging
        int[] arr = new int[r - l + 1];
        int i = l;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= r){
            if(nums[i] < nums[j]){
                arr[k++] = nums[i++];
            }
            else{
                arr[k++] = nums[j++];
            }
        }
        while(i <= mid){
            arr[k++] = nums[i++];
        }
        while(j <= r){
            arr[k++] = nums[j++];
        }

        for(int num: arr){
            nums[l++] = num;
        }


        // return count
        return cnt;
    }

    static int mergesort(int[] nums, int l, int r){
        int cnt = 0;

        if(l >= r){
            return cnt;
        }

        int mid = (l + r)/2;
        cnt += mergesort(nums, l, mid);
        cnt += mergesort(nums, mid + 1, r);
        cnt += merge(nums, l, mid, r);
        return cnt;
    }

    public int reversePairs(int[] nums) {
        return mergesort(nums, 0, nums.length - 1);
    }
}