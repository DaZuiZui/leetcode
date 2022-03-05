package leccod;

public class P1052 {
    public static void main(String[] args) {
        System.out.println(new P1052().maxSatisfied(new int[]{1, 0, 1, 2, 1, 1, 7, 5},
                new int[]{0, 1, 0, 1, 0, 1, 0, 1}, 3
        ));
    }

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int res = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0){
                res+=customers[i];
                //方便下方滑动窗口使用的
                customers[i] =0;
            }
        }
        
        int max = 0;
        int temp = 0;
        for (int i = 0; i < customers.length; i++) {
            temp+=customers[i];
            if (i >= minutes){
                temp-=customers[i-minutes];
            }
            max = Math.max(max,temp);
        }
        return res+max;
    }
}
