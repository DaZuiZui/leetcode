package leccod;

import java.util.Arrays;

public class MST1001 {
    public static void main(String[] args) {
        new MST1001().merge(
                new int[]{1,2,3,0,0,0},3,
                new int[]{2,5,6},3
        );
    }

    public void merge(int[] A, int m, int[] B, int n) {
        //将B融合到A数组
        for(int i = m,j=0 ; i < A.length ;i++,j++){
            A[i] = B[j];
        }
        Arrays.sort(A);
    }
}
