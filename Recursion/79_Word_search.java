class Solution {
    public static boolean checkFurther(char[][] board, String word, int wordIdx, int i, int j){
        // Out of Bound 
        int m = board.length;
        int n = board[0].length;
        if(i < 0 || i >= m || j < 0 || j >= n){
            return false;
        }
        // Character NOT Maches
        if(board[i][j] != word.charAt(wordIdx)){
            return false;
        }
        // Whole Word is Processed
        if(wordIdx == word.length() - 1){
            return true;
        }

        // Marking Character Visited
        char tmp = board[i][j];
        board[i][j] = '$';

        if(checkFurther(board, word, wordIdx + 1, i - 1, j)){
            return true;
        } // Up

        if(checkFurther(board, word, wordIdx + 1, i, j + 1)){
            return true;
        } // Right

        if(checkFurther(board, word, wordIdx + 1, i + 1, j)){
            return true;
        } // Down

        if(checkFurther(board, word, wordIdx + 1, i, j - 1)){
            return true;
        } // Left

        // Backtrack
        board[i][j] = tmp;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board[0].length;j++){
                if(word.charAt(0) == board[i][j]){
                    boolean find = checkFurther(board, word, 0, i, j);
                    if(find) return true;
                }
            }
        }
        return false;
    }
}