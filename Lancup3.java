import java.util.Date;
import java.util.Scanner;

public class Lancup3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 =scanner.next();
        String s2 =scanner.next();
        long getmiao1 = getmiao(s1);
        long getmiao2 = getmiao(s2);
        if (getmiao2 >= getmiao1){
            System.out.println(check(getmiao2 - getmiao1));
        }
    }

    public static String check(long shijian){
        StringBuilder stringBuilder = new StringBuilder();
        long sm = shijian / (60*60);
        if (sm < 10){
            stringBuilder.append("0");
            stringBuilder.append(sm);
            stringBuilder.append(": ");
        } else if (sm == 0) {
            stringBuilder.append("00");
            stringBuilder.append(": ");
        } else{
            stringBuilder.append(sm);
            stringBuilder.append(": ");
        }
        shijian = shijian % (60*60);
        long fm = shijian / 60;
        if (fm <10){
            stringBuilder.append("0");
            stringBuilder.append(fm);
            stringBuilder.append(": ");
        } else if (fm ==0) {
            stringBuilder.append("00");
            stringBuilder.append(": ");
        } else{
            stringBuilder.append(fm);
            stringBuilder.append(": ");
        }

        shijian = shijian % (60);

        if (shijian < 10){
            stringBuilder.append("0");
            stringBuilder.append(shijian);
        } else if (shijian ==0) {
            stringBuilder.append("00");
            stringBuilder.append(": ");
        } else{
            stringBuilder.append(shijian);
        }

        return stringBuilder.toString();
    }

    public static long getmiao(String str){
        Integer shi = Integer.valueOf(str.substring(0,2));
        Integer fen  = Integer.valueOf(str.substring(3,5));
        Integer miao  = Integer.valueOf(str.substring(6,8));
        return miao + fen*60 + shi*60*60;
    }
}
