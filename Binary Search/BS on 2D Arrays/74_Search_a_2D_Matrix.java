class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean hasNum = false;

        int l = 0;
        int r = (matrix.length * matrix[0].length) - 1;

        while(l <= r){
            int mid = (l + r)/2;
            int num = matrix[mid / matrix[0].length][mid % matrix[0].length];

            if(num == target){
                hasNum = true;
                return hasNum;
            }
            else if(num < target){
                l = mid + 1;
            }
            else if(target < num){
                r = mid - 1;
            }
        }

        return hasNum;
    }
}