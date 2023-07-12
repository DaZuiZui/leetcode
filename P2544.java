public class P2544 {
    public static void main(String[] args) {

    }

    public int alternateDigitSum(int n) {
        int sum = 0;
        boolean b = true;
        String str = n+"";
        for (int i = 0; i < str.length(); i++) {
            if(b){
                sum +=(str.charAt(i)-'0');
            }else{
                sum-=(str.charAt(i)-'0');
            }
            b= !b;

        }

        return sum;
    }
}
