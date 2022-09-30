import java.util.Scanner;

public class LuoguP1567 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long last = -1;
        int current = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            long tmp =scanner.nextLong();
            if (i == 0){
                last = tmp;
                current=1;
                continue;
            }

            if (tmp > last){
                current++;
                max = Math.max(max,current);
            }else{
                current = 1;
            }

            last = tmp;
        }

        System.out.println(max);
    }
}
