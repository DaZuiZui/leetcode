package leccod;

public class P7 {
    public static void main(String[] args) {
        System.out.println(new P7().reverse(-123));
    }

    public int reverse(int x) {
        //get hundreds
        String s = new String(String.valueOf(x));
        StringBuilder stringBuilder  = new StringBuilder();
        int start = 0;
        if (x < 0){
            start =1;
        }

        for (int i = s.length() -1; i >= start ; i--) {
            stringBuilder.append(s.charAt(i));
        }
        long returnnumber = 0;

        try {
            x = Integer.parseInt(String.valueOf(stringBuilder));
        } catch (NumberFormatException e) {
            return 0;
        }


        if (start == 1){
            x *= -1;
        }
        return x;
    }
}
