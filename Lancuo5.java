import java.util.Scanner;

public class Lancuo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int p = scanner.nextInt();

        if ((p-1)*a + a <= t) {
            System.out.println(((p-1)*a+1)+" "+((p-1)*a+a));
        }else{
            System.out.println(((p-1)*a+1)+" "+t);

        }

        scanner.close();
    }
}
