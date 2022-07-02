import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1619 {
    public static void main(String[] args) {
        System.out.println(new P1619()
                .trimMean(new int[]{6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0}));
    }

    public double trimMean(int[] arr) {
        double res = 0.0;
        Arrays.sort(arr);
        int start = (int)(arr.length * 0.05);
        int end   = arr.length - start;
        int size = end -start;
        for (int i = start; i < end; i++) {
            res += (double)arr[i] / size;
        }

        return res;
    }
}
