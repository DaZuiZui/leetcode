public class P1267 {
    public static void main(String[] args) {

    }

    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int res =0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1){
                    arr1[i]++;
                    arr2[j]++;
                }
            }
        }


        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && (arr1[i] > 1 || arr2[j] > 1)){
                    res++;
                }
            }
        }

        return res;
    }
}
