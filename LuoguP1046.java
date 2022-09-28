import java.util.Scanner;

public class LuoguP1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int heigh = 0;
        heigh = scanner.nextInt();

        int res = 0;
        for (int i : arr) {
            if (heigh + 30 >= i){
                res++;
            }
        }

        System.out.println(res);
    }
}
