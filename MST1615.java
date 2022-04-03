package leccod;

import java.util.HashMap;

public class MST1615 {
    public static void main(String[] args) {
        int[] ints = new MST1615().masterMind("RGRB", "BBBY");
        System.out.println(ints[0] +"and" +ints[1]);
    }

    public int[] masterMind(String solution, String guess) {
        int[] arr = new int[2];
        char[] chararr1 = solution.toCharArray();
        System.out.println(chararr1.length);
        char[] chararr2 = guess.toCharArray();

        for (int i = 0; i < solution.length(); i++) {
            /**
             * 命中
             */
            if (chararr1[i] == chararr2[i]){
                chararr1[i] = 'x';
                chararr2[i] = 'x';
                arr[0]++;
            }
        }
        System.out.println(arr[0]);
        //查看伪命中
        for (int i = 0; i < chararr1.length; i++) {
            for (int j = 0; j < chararr1.length; j++) {
                //System.out.println(chararr1[i] +" "+chararr2[j]);
                if (chararr1[i] != 'x'  && chararr2[j] !='x'){
                    if (chararr1[i] == chararr2[j]){
                        chararr1[i] = 'x';
                        chararr2[j] = 'x';
                        arr[1]++;
                    }
                }
            }
        }


        return arr;
    }
}
