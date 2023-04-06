import java.util.Scanner;

public class LuougP3984 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] dp = new int[n];
        int top = 0;
        int res =0;
        for (int i = 0; i < n; i++) {
            int tmp = scanner.nextInt();
            if (tmp >= top){
                res+=t;
                top = tmp+t;
            }else{
                res += tmp +t - top;
                top = tmp+t;
            }
        }

        System.out.println(res);
    }
}
