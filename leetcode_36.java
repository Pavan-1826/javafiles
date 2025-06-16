import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (rowSet.contains(c)) {
                        return false;
                    }
                    rowSet.add(c);
                }
            }
        }
        for (int j = 0; j < 9; j++) {
            Set<Character> colSet = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char c = board[i][j];
                if (c != '.') {
                    if (colSet.contains(c)) {
                        return false;
                    }
                    colSet.add(c);
                }
            }
        }
        for (int block = 0; block < 9; block++) {
            Set<Character> blockSet = new HashSet<>();
            int startRow = (block / 3) * 3;
            int startCol = (block % 3) * 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    char c = board[startRow + i][startCol + j];
                    if (c != '.') {
                        if (blockSet.contains(c)) {
                            return false; 
                        }
                        blockSet.add(c);
                    }
                }
            }
        }

        return true; 
    }
}
