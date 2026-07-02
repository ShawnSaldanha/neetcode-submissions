class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                String rowKey = board[i][j] + " seen in row "+ i;
                String colKey = board[i][j] + " seen in col "+ j;
                String boxKey = board[i][j] + " seen in box "+ (i/3) + "-" + (j/3);
                if( !seen.add(boxKey) || 
                    !seen.add(rowKey) || 
                    !seen.add(colKey)){
                    return false;
                }
            }
        }
        return true;
    }
}
