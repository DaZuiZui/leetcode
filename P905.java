package leccod;

import java.util.ArrayList;
import java.util.Arrays;

public class P905 {
    public static void main(String[] args) {
        int[] arr = new P905().sortArrayByParity(new int[]{1,2,3,4});
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        ArrayList<Integer> list = new ArrayList();
        int index =0;
        for (int i = 0; i < nums.length; i++) {

            //判断是否为偶数
            if (nums[i] % 2 == 0){
                res[index] = nums[i];

                index++;
            }else{
                list.add(nums[i]);
            }
        }

        for (int i = index,j =0; i < nums.length ; i++,j++) {
            res[i] = list.get(j);
        }


        return res;
    }
}
