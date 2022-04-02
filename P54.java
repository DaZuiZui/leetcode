package leccod;

import java.util.ArrayList;
import java.util.List;

public class P54 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(new P54().spiralOrder(arr));;
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top = 0 ,down = matrix.length-1;
        int l   = 0 ,r    = matrix[0].length-1;

        while(true){
            for (int i = l; i <= r ; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            if (l > r) break;

            for (int i = top; i <= down ; i++) {
                list.add(matrix[i][r]);
            }
            r--;
            if (top > down) break;

            for (int i = r; i >= l ; i--) {
                list.add(matrix[down][i]);
            }
            down--;
            if (l >r) break;

            for (int i = down; i >= top ; i--) {
                list.add(matrix[i][l]);
            }
            l++;
            if (top > down) break;
        }

        return list;
    }
}
