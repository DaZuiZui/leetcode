public class P507 {
    public static void main(String[] args) {

    }

    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                sum+=i;
            }
        }

        return sum == num;
    }
}
