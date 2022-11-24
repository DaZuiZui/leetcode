import java.util.Scanner;

public class P1179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int res = 0;
        for (int i = l; i <=r ; i++) {
            int tmp = i;
            while (tmp != 0){
                if (tmp % 10 == 2){
                    res++;
                }
                tmp/=10;
            }
        }
        System.out.println(res);
    }
}
