package leccod;

import java.util.*;

public class P2094 {
    public static void main(String[] args) {
        new P2094().findEvenNumbers(new int[]{2,1,3,0});
    }

    Set<Integer> list = new HashSet<>();

    public int[] findEvenNumbers(int[] digits) {
        boolean[] b = new boolean[digits.length];
        dfs(digits,"",0,b);
        int[] arr = new int[list.size()];
        int i =0 ;
        for (Integer integer : list) {
            arr[i] = integer;
            i++;
        }
        Arrays.sort(arr);
        return arr;
    }

    public void dfs(int[] digits,String str,int index,boolean[] b){
        //判断首位是否为0
        if (str.length() > 0 && str.charAt(0) == '0'){
            return;
        }
        //结束判断
        if (index > 2){
            if (Integer.valueOf(str) % 2 ==0)
                list.add(Integer.valueOf(str));
            return;
        }


        for (int i = 0; i < digits.length; i++) {
            if (b[i]){
                continue;
            }

            b[i] = true;
            dfs(digits, str+""+digits[i], index+1, b);
            b[i] = false;
        }
    }
}
