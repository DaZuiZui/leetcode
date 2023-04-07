import java.util.Scanner;

public class Lancup20222 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[20][20];
        for (int i = 0; i < 20; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                arr[i][i1] = scanner.nextInt();
            }
        }

        int res =0 ;
        for (int i = 5; i < 21 ; i++) {
            for (int j =5; j < 21; j++) {
                int tmp =0;
                for (int k = i-5; k < i; k++) {
                    for (int l = j-5; l < j; l++) {
                        tmp += arr[k][l];
                    }
                }

                res = Math.max(res,tmp);
            }
        }

        System.out.println(res);
    }

}
