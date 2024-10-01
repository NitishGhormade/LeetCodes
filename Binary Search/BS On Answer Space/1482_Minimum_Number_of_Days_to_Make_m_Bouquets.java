class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int len = bloomDay.length;
        if(len < (long)m * (long)k){
            return -1;
        }

        int max = bloomDay[0];
        for(int i = 0;i < len;i++){
            if(max < bloomDay[i]){
                max = bloomDay[i];
            }
        }
        System.out.println("max: " + max);

        int l = 1;
        int r = max;
        int day = max;

        while(l <= r){
            int mid = (l + r)/2;

            int mtmp = m;
            int ktmp = k;
            for(int i = 0;i < len;i++){
                if(bloomDay[i] <= mid){
                    if(i == 0 || k == 1){
                        ktmp--;
                    }
                    else if(ktmp == k){
                        ktmp--;
                    }
                    else if(ktmp < k && bloomDay[i] <= mid && bloomDay[i - 1] <= mid){
                        ktmp--;
                    }

                    if(ktmp == 0){
                        mtmp--;
                        ktmp = k;
                    }
                    if(mtmp == 0){
                        day = mid;
                        break;
                    }
                }
                else{
                    ktmp = k;
                }
            }
            System.out.println("day: " + day);

            if(mtmp > 0){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }

        return day;
    }
}