public class P2710 {
    public static void main(String[] args) {
        System.out.println(new P2710().removeTrailingZeros("51230100"));
    }

    public String removeTrailingZeros(String num) {
        int n = num.length();
        int end = n;
        for (int i = n-1; i >= 0 ; i--) {
            if (num.charAt(i) == '0'){
                end--;
            }else{
                break;
            }
        }

        return num.substring(0,end);
    }
}
