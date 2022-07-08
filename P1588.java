public class P1588 {
    public static void main(String[] args) {
        System.out.println(new P1588().sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
    }

    public int sumOddLengthSubarrays(int[] arr) {
        int res =0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                count++;
                if (count % 2 ==1){
                    System.out.println(sum);
                    res+=sum;
                }
            }
        }

        return res;
    }
}
