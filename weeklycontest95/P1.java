package weeklycontest95;

import java.math.BigInteger;

public class P1 {
    public static void main(String[] args) {
        System.out.println(new P1().categorizeBox(3223, 1271, 2418, 749));
    }

    public String categorizeBox(int length, int width, int height, int mass) {
        int targer = 10000;
        //1000000000
        BigInteger tiji   = new BigInteger("1000000000");
        //Long tmp = Long.valueOf(length * width * height);
        BigInteger bigInteger1 = new BigInteger(String.valueOf(length));
        BigInteger bigInteger2 = new BigInteger(String.valueOf(width));
        BigInteger bigInteger3 = new BigInteger(String.valueOf(height));
        //System.out.println(bigInteger1.multiply(bigInteger2).multiply(bigInteger3));
        String str1 = bigInteger1.multiply(bigInteger2).multiply(bigInteger3).toString();
        String str2 = tiji.toString();
        boolean t1 = str1.length() == str2.length() ?
                bigInteger1.multiply(bigInteger2).multiply(bigInteger3).toString().compareTo(tiji.toString()) >= 0 :
                str1.length() > str2.length() ? true : false;
        boolean t2 = length >= targer || width >= targer || height >= targer;
        boolean t3 =  mass >= 100;
        if ((t1 || t2) && t3){
            return "Both";
        }else if ((t1 || t2) == false && t3 == false){
            return "Neither";
        }else if ((t1 || t2) == true && t3 == false){
            return "Bulky";
        }else if ((t1 || t2) == false && t3 == true){
            return "Heavy";
        }else if ((t1 || t2) == true){
            return "Bulky";
        }else if (t3 == true){
            return "Heavy";
        }


        return "";
    }
}
