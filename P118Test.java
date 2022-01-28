package leccod;

import java.util.List;

public class P118Test {
    public static void main(String[] args) {
        new P118Test().generate(4);
    }

    public List<List<Integer>> generate(int numRows) {
        int[][] arr = new int[numRows+1][numRows+1];
        arr[0][0] =  1;

        arr[1][0] =  1;

        arr[1][1] =  1;

        int kongge = numRows;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < kongge-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                if (i==0){
                    System.out.print(1);
                    break;
                }else if (i == 1){
                    System.out.print(1+" ");
                    System.out.print(1+" ");
                    break;
                }

                if (j ==0){
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] +" ");
                }
                if (j != i && j != 0){
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    System.out.print(arr[i][j] +" ");
                }
                if ( j == i){
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] +" ");
                }
            }
            System.out.println();
        }

        return null;
    }
}
