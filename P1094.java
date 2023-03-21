package mst;

import java.util.Scanner;

public class P1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            arr[i] = str.toCharArray();
        }
        int res1 = 0;
        boolean[][] b = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (b[i][j] == false){
                    res1++;
                    dfs1(b,arr,i,j,arr[i][j]);
                }
                if (arr[i][j] == 'G') arr[i][j] = 'B';
            }
        }
        int res2 =0;
        b = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (b[i][j] == false){
                    res2++;
                    dfs1(b,arr,i,j,arr[i][j]);
                }
            }
        }
        System.out.println(res1 -res2);
    }

    public static void dfs1(boolean[][] b,char[][] c,int i,int j,char a){
        //越界处理
        if (i >= b.length || i <0) return;
        if ( j >= b[0].length || j <0) return;
        //已经处理过
        if (b[i][j]) return;
        //是否匹配
        if (c[i][j] != a) {
            return;
        }
        b[i][j] = true;
        dfs1(b, c, i+1, j, a);
        dfs1(b, c, i-1, j, a);
        dfs1(b, c, i, j+1, a);
        dfs1(b, c, i, j-1, a);
    }
}
