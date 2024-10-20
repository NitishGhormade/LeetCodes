// 90 Degree Rotate = Array Transpose > Each Row Reverse

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Transpose Matrix
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < n;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        // Reverse Each Row
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= (n - 1)/2;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = tmp;
            }
        }
    }
}