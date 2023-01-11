import java.util.Arrays;

public class P2283 {
    public static void main(String[] args) {
        System.out.println(new P2283().digitCount("6210001000"));
    }

    public boolean digitCount(String num) {
        int max = Integer.MIN_VALUE;
        int n = num.length();
        int[] arr = new int[10];

        for (int i = 0; i < n; i++) {
            arr[num.charAt(i) - '0']++;
        }

        for (int i = 0; i < n; i++) {
            int tmp = Integer.valueOf(num.charAt(i) -'0');   //数字i应该出现的个数
            //System.out.println(i+"出现的个数"+arr[i]+"   "+tmp);
            //tmp
            if (tmp != arr[i]){
                return false;
            }
        }

        return true;
    }
}
