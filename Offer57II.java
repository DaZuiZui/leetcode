package leccod;

import java.util.ArrayList;
import java.util.List;

public class Offer57II {
    public static void main(String[] args) {

    }

    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();

        int sum =0;
        for (int i = 1; i <= target / 2; i++) {
            for (int j = i; true ; j++) {
                sum+=j;
                if (sum > target){
                    sum = 0;
                    break;
                }else{
                    int[] arr = new int[j-i+1];
                    for (int k = i; k < j; k++) {
                        arr[k-i] = k;
                    }

                    list.add(arr);
                    sum =0 ;
                    break;
                }
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}

