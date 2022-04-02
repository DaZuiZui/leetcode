package leccod;

public class P59 {
    public static void main(String[] args) {
        int[][] ints = new P59().generateMatrix(3);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                System.out.print(ints[i][j]+" ");
            }
            System.out.println();
        }
    }

    public int[][] generateMatrix(int n) {
        //如果为null
        if (n==0){
            return new int[][]{};
        }
        int[][] arr = new int[n][n];
        int top = 0, down = arr.length-1;
        int l   = 0, r    = arr[0].length-1;
        int currenNumber = 1;

        while (true){
            //设置从左到又
            for (int i = l; i <= r; i++) {
                arr[top][i] = currenNumber++;
            }
            top++;
            if (l > r) break;

            //设置从上到下
            for (int i = top; i <= down; i++) {
                arr[i][r] = currenNumber++;
            }
            r--;
            if (top > down) break;

            //设置从又到左
            for (int i = r; i >= l ; i--) {
                arr[down][i] = currenNumber++;
            }
            down--;
            if (l > r) break;

            //设置从下到上
            for (int i = down ; i >= top ; i--) {
                arr[i][l] = currenNumber++;
            }
            l++;
            if (top > down) break;
        }
        return arr;
    }
}
