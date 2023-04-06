import java.util.*;

public class LuoguP1102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        int n =  scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }
        if (m >= set.size()){
            System.out.println("NO RESULT");
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList<>(set);
        System.out.println(arrayList.get(m - 1));
        scanner.close();
    }
}
