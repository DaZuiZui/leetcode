package leccod;

public class P258 {
    public static void main(String[] args) {
        System.out.println(new P258().addDigits(0));
    }

    public int addDigits(int num) {
        String numstr = num+"";
        int returnnum = 0;

        for (int i = 0; i < numstr.length(); i++) {
            returnnum += Integer.valueOf( (numstr.charAt(i)+""));
        }

        if (returnnum > 9){
            returnnum = addDigits(returnnum);
        }

        return returnnum;
    }
}
