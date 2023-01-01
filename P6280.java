package l;

import java.util.ArrayList;
import java.util.List;

public class P6280 {
    public static void main(String[] args) {
        int[] ints = new P6280().closestPrimes(10, 19);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public int[] closestPrimes(int left, int right) {
        if (left < 2){
            left = 2;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right ; i++) {
            if (isPrime(i)){
                list.add(i);
            }
        }
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        int min = Integer.MAX_VALUE;
        list.sort(null);

        for (int i = 0; i < list.size()-1; i++) {
            if ((list.get(i+1) - list.get(i)) < min){
                res[0] = list.get(i);
                res[1] = list.get(i+1);
                min = (list.get(i+1) - list.get(i));
            }
        }

        return res;
    }

    public boolean isPrime(int num){
        for (int i = 2; i*i <= num ; i++) {
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }
}
