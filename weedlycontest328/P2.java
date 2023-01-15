package weedlycontest328;

public class P2 {
    public static void main(String[] args) {
        int[][] ints = new P2().rangeAddQueries(2, new int[][]{{0, 0, 1, 1}});
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] res = new int[n][n];
        for (int[] query : queries) {
            int x1 = query[0];
            int y1 = query[1];
            int x2 = query[2];
            int y2 = query[3];

            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    res[i][j]++;
                }
            }
        }

        return res;
    }
}
