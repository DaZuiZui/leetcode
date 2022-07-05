public class P1343 {
    public static void main(String[] args) {
        System.out.println(new P1343().numOfSubarrays(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 3, 4));
    }

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res =0;

        int sum = 0;
        for (int l = 0,r =0; l < arr.length - k; r++) {
            sum += arr[r];
            if (r - l == k){
                if (sum * 1.0 / k >= threshold){
                    res++;
                }
                sum -= arr[l];
                l++;
            }
        }

        return res;
    }
}
