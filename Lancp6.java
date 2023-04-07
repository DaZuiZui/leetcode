import java.util.Arrays;
import java.util.Scanner;

public class Lancp6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] arr = new int[n][m];
        int[][] dp = new int[m][n];
        int tmp1 =0;

        for (int i = 0; i < m; i++) {
            int tmp2 =i;
            for (int j = 0; j < n; j++) {
                int tmp =  scanner.nextInt();
                arr[j][tmp2] = tmp;
                dp[i][j] =tmp;
            }
        }

        for (int i = 0; i < n; i++) {
            Arrays.sort(arr[i]);
        }

      //  System.out.println(bFind(arr[0], 5));

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int res =0;
            for (int j = 0; j < n; j++) {
                //我知道了我排在倒数第几名
                int target = bFind(arr[j], dp[i][j]);
                target = m - target+1;

                res += Math.max(k+1-target,0);
            }
            stringBuilder.append(res+" ");
        }
        System.out.println(stringBuilder.toString().trim());
    }

    public static int bFind(int[]arr,int target){

        int l = 0;
        int r = arr.length-1;
        while (l <= r){
            int mid = l + ((r-l) /2);
            if (arr[mid] > target){
                r = mid-1;
            }else if (arr[mid] < target){
                l = mid+1;
            }else{
                return mid+1;
            }
        }
        return -1;
    }
}
