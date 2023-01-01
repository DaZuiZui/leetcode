import java.util.HashSet;
import java.util.Set;

public class P6279 {
    public static void main(String[] args) {
        System.out.println(new P6279().distinctPrimeFactors(new int[]{2,4,3,7,10,6}));
    }

    private Set<Integer> set = new HashSet<>();
    public int distinctPrimeFactors(int[] nums) {
        int sum = 1;
        for (int num : nums) {
            sum *= num;
        }
        addPrime(sum);
        return set.size();
    }

    public void addPrime(int num){
        //判断是否为质数
        if (isPrime(num)){
            set.add(num);
        }
        //分解
        for (int i = 2; i * i <= num ; i++) {
            if (num % i == 0){
                addPrime(i);
                addPrime(num / i);
            }
        }
    }

    public boolean isPrime(int num){
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }

}
