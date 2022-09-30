public class MST0108 {
    public static void main(String[] args) {
        
    }

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[] row     = new boolean[m];
        boolean[] columns = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0){
                    row[i] = true;
                    columns[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[0] || columns[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
