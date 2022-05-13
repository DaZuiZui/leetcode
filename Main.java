package lancup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> map  =new HashMap<>();
        String tempstr = "";
        for (char c : arr) {
            if (!map.containsKey(c)){
                tempstr+=c;
            }
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int max = Integer.MIN_VALUE;
        for (Integer value : map.values()) {
            max = Math.max(value,max);
        }

        String res  ="";
        for (char c : tempstr.toCharArray()) {
            if (map.get(c) == max){
                res +=c;
            }
        }

        char[] arr1 = res.toCharArray();
        Arrays.sort(arr1);
        System.out.println(new String(arr1).toString());
    }
}
