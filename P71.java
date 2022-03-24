package leccod;

public class P71 {
    public static void main(String[] args) {

    }

    public void setZeroes(int[][] matrix) {
        boolean[] l = new boolean[matrix.length];
        boolean[] h = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    l[i] =h[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (l[i] || h[i]){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
