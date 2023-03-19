package MST;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        for (int l = 0,r = 0 ; r < n; r++) {
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            while (map.get(arr[r]) >= k){
                map.put(arr[l],map.get(arr[l])-1);
                l++;
                count+= n-r;
            }
        }

        System.out.println(count);
    }
}
