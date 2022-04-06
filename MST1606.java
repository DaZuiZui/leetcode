package leccod;

import java.util.Arrays;

public class MST1606 {
    public static void main(String[] args) {

    }

    public int smallestDifference(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i =0,j=0;
        int min = Integer.MIN_VALUE;

        while (i < a.length && j < b.length){
            long diff = a[i] - b[j];
            min = (int) Math.min(min,Math.abs(diff));
            if (diff < 0){
                i++;
            }else{
                j++;
            }
        }

        return min;
    }
}
