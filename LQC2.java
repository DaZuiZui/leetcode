import java.util.Arrays;

public class LQC2 {
    public static void main(String[] args) {
        String str= "WHERETHEREISAWILLTHEREISAWAY";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String str1 = new String(chars);
        System.out.println(str1);
    }
}
