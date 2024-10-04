// Solution using LINARY APPROACH
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int cnt = 0;
        int num = 0;

        cnt += arr[0] - 1;
        if(cnt >= k){
            num = 0 + k;
        }
        else {
            int i = 1;
            for(i = 1;i < arr.length;i++){
                if(cnt + arr[i] - 1 - arr[i - 1] >= k){
                    return arr[i - 1] + k - cnt;
                }
                cnt += arr[i] - 1 - arr[i - 1];
            }

            if(cnt < k){
                num = arr[i - 1] + k - cnt;
            }
        }

        return num;
    }
}