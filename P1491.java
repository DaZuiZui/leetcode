package leccod;

import java.util.Arrays;

public class P1491 {
    public static void main(String[] args) {
        System.out.println(new P1491().average(new int[]{4000, 3000, 1000, 2000}));
    }

    public double average(int[] salary) {
        Arrays.sort(salary);
        int min = salary[0];
        int max = salary[salary.length-1];
        int count =0;
        double sum   =0;
        for (int i = 0; i < salary.length; i++) {
           if (salary[i] == min || salary[i] == max){
               continue;
           }

           sum+=salary[i];
           count++;
        }
        return sum/count;
    }
}
