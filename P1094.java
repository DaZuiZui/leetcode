import java.util.Arrays;

public class P1094 {
    public static void main(String[] args) {

    }

    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr = new int[1001];

        for (int i = 0; i < trips.length; i++) {
            arr[trips[i][1]] += trips[i][0];
            arr[trips[i][2]] -= trips[i][0];
        }

        int sum  = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
            if (sum > capacity){
                return false;
            }
        }
        return true;
    }
}
