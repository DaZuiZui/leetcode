package WeeklyContest329;

public class P1 {
    public static void main(String[] args) {
        System.out.println(new P1().alternateDigitSum(521));
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
