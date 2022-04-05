package leccod;

public class P762 {
    public static void main(String[] args) {
        System.out.println(Integer.bitCount(10));
    }

    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for (int i = left; i <= right ; i++) {
            if (isPrime(Integer.bitCount(i))){
                res++;
            }
        }
        return res;
    }


    private boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i*i<=x ; i++) {
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}
