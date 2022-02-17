package leccod;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1380 {
    public static void main(String[] args) {
        System.out.println(new P1380().luckyNumbers(new int[][]{
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        }));
    }

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            //查找在当前行最小的下标
            for (int j = 0; j < matrix[i].length; j++) {
                //查看是否为最小
                boolean ismin = true;
                //查看当前下标是否为最小
                for (int k = 0; k < matrix[i].length; k++) {
                    if (matrix[i][j] > matrix[i][k]){
                        ismin = false;
                        break;
                    }
                }

                if (ismin == false){
                    continue;
                }

                //查看是否为最大
                boolean ismax = true;
                //查看当前在列种是否为最大
                for (int k = 0; k < matrix.length; k++) {
                    if (matrix[k][j] > matrix[i][j]){
                        ismax = false;
                        break;
                    }
                }

                if (ismax==false){
                    continue;
                }else{
                    //写入list
                    list.add(matrix[i][j]);
                }


            }
        }



        return list;
    }

}
