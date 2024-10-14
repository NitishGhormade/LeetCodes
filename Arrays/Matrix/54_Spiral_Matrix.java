class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ls = new ArrayList<>();
        
        int rowL = 0;
        int rowR = m - 1;
        int colL = 0;
        int colR = n - 1;
        int cnt = 0;

        while(cnt < m * n){
            // Right
            for(int i = colL;i <= colR;i++){
                if(cnt < m * n){
                    ls.add(matrix[rowL][i]);
                    cnt++;
                }
            }
            rowL++;

            // Down
            for(int i = rowL;i <= rowR;i++){
                if(cnt < m * n){
                    ls.add(matrix[i][colR]);
                    cnt++;
                }
            }
            colR--;

            // Left
            for(int i = colR;i >= colL;i--){
                if(cnt < m * n){
                    ls.add(matrix[rowR][i]);
                    cnt++;
                }
            }
            rowR--;

            // Up
            for(int i = rowR;i >= rowL;i--){
                if(cnt < m * n){
                    ls.add(matrix[i][colL]);
                    cnt++;
                }
            }
            colL++;
        }
        
        return ls;
    }
}