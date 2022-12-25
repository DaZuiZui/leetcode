public class P59 {
    public static void main(String[] args) {
        new P59().generateMatrix(0);
    }

    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int ll =0,rl = n-1;
        int tl = 0,bl = n-1;
        int num = 1;
        while (ll <= rl || tl <= bl ){
            //从左到右
            for (int i = ll; i <= rl ; i++) {
                arr[tl][i] = num++;
            }
            tl++;
            //从上到下
            for (int i = tl; i <= bl ; i++) {
               arr[i][rl] = num++;
            }
            rl--;
            for (int i = rl; i >= ll ; i--) {
                arr[bl][i] = num++;
            }
            bl--;
            for (int i = bl; i >= tl ; i--) {
                arr[i][ll] = num++;
            }
            ll++;
        }

        return arr;
    }
}
