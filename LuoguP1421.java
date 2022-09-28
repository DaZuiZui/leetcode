import java.util.Scanner;

public class LuoguP1421 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jiao = scanner.nextInt() * 10;
        jiao    += scanner.nextInt();
        int price = 19;
        System.out.println(jiao / price);
    }
}
