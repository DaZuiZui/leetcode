package leccod;

import java.util.HashSet;

public class P79 {
    public static void main(String[] args) {
        System.out.println(new P79().exist(new char[][]{{'A', 'B', 'C', 'E' }, {'S', 'F', 'C', 'S' }, {'A', 'D', 'E', 'E' }}, "ABC"));
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] b = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board,word,i,j,b,0)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, String word,int i,int j,boolean[][] b,int index){
        if (index >= word.length()){
            return true;
        }


        if (i < 0 || j< 0 || i >= board.length || j >= board[0].length || b[i][j] || word.charAt(index) !=board[i][j]){
            return false;
        }

        b[i][j] = true;
        boolean res = dfs(board, word, i-1, j, b, index+1) || dfs(board, word, i+1, j, b, index+1) ||
                      dfs(board, word, i, j+1, b, index+1) || dfs(board, word, i, j-1, b, index+1);

        b[i][j] = false;

        return res;
    }
}
