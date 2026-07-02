class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];
        for( int i = 0 ; i < 9 ; i++){
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for(int row = 0 ; row < board.length ; row++){
            for(int column = 0 ; column < board.length ; column++){
                if(board[row][column] == '.'){
                    continue;
                }
                if( rows[row].contains(board[row][column]) 
                    || columns[column].contains(board[row][column])
                    || boxes[(row/3)*3+(column/3)].contains(board[row][column])){
                    return false;
                }
                rows[row].add(board[row][column]);
                columns[column].add(board[row][column]);
                boxes[(row/3)*3+(column/3)].add(board[row][column]);
            }
        }
        return true;
    }
}
