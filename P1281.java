public class P1281 {
    public static void main(String[] args) {

    }

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum     = 0;
        while (n >0){
            product *= n % 10;
            sum     += n % 10;
            n /= 10;
        }

        return product - sum;
    }
}
