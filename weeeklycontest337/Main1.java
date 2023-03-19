package weeeklycontest337;



public class Main1 {
    public static void main(String[] args) {
        int[] ints = new Main1().evenOddBit(2);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public int[] evenOddBit(int n) {
         String str = Integer.toBinaryString(n).toString();
         int l = str.length();
         int res1 = 0;
         int res2 = 0;
       // System.out.println(str);
        for (int i = 0; i < l; i++) {
            if (i% 2 == 0 && str.charAt(l-1-i) == '1'){
                res1++;
            }else if (i %2 != 0 && str.charAt(l-1-i) == '1'){
                res2++;
            }
        }

        return new int[]{res1,res2};
    }

}
