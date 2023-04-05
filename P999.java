public class P999 {
    public static void main(String[] args) {
        System.out.println(new P999().numRookCaptures(new char[][]{{'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'R', '.', '.', '.', 'p'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}}
        ));
    }

    public int numRookCaptures(char[][] board) {
        int res = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    res = search(board, i, j);
                }
            }
        }
        return res;
    }

    public int search(char[][] board, int i, int j) {
        int sum = 0;
        for (int x = j; x < board[0].length; x++) {
            if (board[i][x] == 'B') {
                break;
            }
            if (board[i][x] == 'p') {
                sum++;
                break;
            }
        }

        for (int x = j; x >= 0; x--) {
            if (board[i][x] == 'B') {
                break;
            }
            if (board[i][x] == 'p') {
                sum++;
                break;
            }
        }

        for (int y = i; y < board.length; y++) {
            if (board[y][j] == 'B') {
                break;
            }
            if (board[y][j] == 'p') {
                sum++;
                break;
            }
        }

        for (int y = i; y >= 0; y--) {
            if (board[y][j] == 'B') {
                break;
            }
            if (board[y][j] == 'p') {
                sum++;
                break;
            }
        }
        return sum;
    }

}
