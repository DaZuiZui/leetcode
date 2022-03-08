package leccod;

import java.util.Arrays;

public class MST1719 {
    public static void main(String[] args) {
        new MST1719().missingTwo(new int[]{1});
    }

    public int[] missingTwo(int[] nums) {
        int count = 0;
        int[] arr = new int[2];
        for (int i = 1,j=0; j < nums.length; i++,j++) {
            if (i != nums[j]){
                arr[count] = i;
                count++;
                j--;
            }
        }

        int last = -1;
        while (count < 2){
            if (last != -1){
                arr[count] = ++last;
            }else{
                arr[count] = nums[nums.length-1]+1;
                last = arr[count];
            }
            count++;
        }

        for (int i : arr) {
            System.out.println(i);
        }
        return arr;
    }
}
