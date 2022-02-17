package leccod;

import java.util.ArrayList;
import java.util.LinkedList;

public class P66 {
    public static void main(String[] args) {
        new P66().plusOne(new int[]{9,9,9});
    }

    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList();
        int fj = 0;
        for (int i = digits.length -1; i >= 0 ; i--) {
            if (i == digits.length -1){
                digits[i] += 1;
            }

            digits[i]+=fj;
            fj=0;

            if (digits[i] >= 10){
                fj++;
                digits[i] = digits[i] - 10;
            }
            list.add(digits[i]);
        }
        if (fj >0){
            list.add(fj);
        }

        int[] arr = new int[list.size()];
        for (int i = list.size()-1,j =0; i >=0 ; i--,j++) {
            arr[j] = list.get(i);
        }
        return arr;
    }
}
