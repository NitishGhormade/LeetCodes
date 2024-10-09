// We can start form BOTTOM LEFT or TOP RIGHT to decide whether to eleminate the ROW or COLUMN.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean hasNum = false;
        int r = matrix.length - 1;
        int c = 0;

        while(r >= 0 && c <= matrix[0].length - 1){
            if(matrix[r][c] == target){
                hasNum = true;
                return hasNum;
            }
            else if(matrix[r][c] < target){
                c++;
            }
            else if(matrix[r][c] > target){
                r--;
            }
        }

        return hasNum;
    }
}