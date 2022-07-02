import java.util.ArrayList;
import java.util.List;

public class P43 {
    public static void main(String[] args) {
        System.out.println(new P43().multiply("123", "456"));
        //System.out.println(new P43().sumOfString("567", "1234"));
    }

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        StringBuilder stringBuilder1 = new StringBuilder(num1);
        StringBuilder stringBuilder2 = new StringBuilder(num2);
        String n1 = stringBuilder1.reverse().toString();
        String n2 = stringBuilder2.reverse().toString();
        int lengthofn1 = n1.length();
        int lengthofn2 = n2.length();
        int maxlength  = Math.max(lengthofn1,lengthofn2);

        StringBuilder res = new StringBuilder();
        int carry = 0;

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n1.length(); i++) {
            StringBuilder tmp = new StringBuilder();
            int n1tmp = n1.charAt(i) - '0';
            for (int j = 0; j < n2.length(); j++) {
                int n2tmp = n2.charAt(j) - '0';
                int sum = n1tmp * n2tmp + carry;
                carry =0;
                //System.out.println(n1tmp +"*"+n2tmp+"="+sum);
                //获取各位
                int siglenum = sum % 10;
                //获取进位
                carry =  sum /10;
                tmp.append(siglenum);
            }

            //查看是否有进位
            if (carry > 0 ){
                tmp.append(carry);
                carry = 0;
            }

            //尾部追加0
            tmp = tmp.reverse();
            for (int j = 0; j < i; j++) {
                tmp.append(0);
            }
            System.out.println();
            list.add(tmp.toString());
        }

        System.out.println(list);
        String ans = "";
        for (int i = 0; i < list.size(); i++) {
            ans = sumOfString(ans, list.get(i));
        }

        return ans;
    }


    public String sumOfString(String num1,String num2){
        StringBuilder res = new StringBuilder();
        int carry = 0;
        StringBuilder n1 = new StringBuilder(num1);
        StringBuilder n2 = new StringBuilder(num2);
        String n1tmp = n1.reverse().toString();
        String n2tmp = n2.reverse().toString();
        int maxlength = Math.min(num1.length(),num2.length());

        //计算公共长度的zhi
        for (int i = 0; i < maxlength; i++) {
                int num1tmp = n1tmp.charAt(i) - '0';
                int num2tmp = n2tmp.charAt(i) - '0';
                int sum = num1tmp + num2tmp + carry;
                carry =0;
                int singnum = sum%10;
                carry = sum /10;

                res.append(singnum);

        }

        if (maxlength < n1tmp.length()){
            for (int i = maxlength; i < n1tmp.length(); i++) {
                int sum = n1tmp.charAt(i) - '0';
                sum += carry;
                carry =0;
                int singnum = sum%10;
                carry = sum /10;
                res.append(singnum);
            }
        }else if (maxlength < n2tmp.length()){
            for (int i = maxlength; i < n2tmp.length(); i++) {
                int sum = n2tmp.charAt(i) - '0';
                sum += carry;
                carry =0;
                int singnum = sum%10;
                carry = sum /10;
                res.append(singnum);
            }
        }

        //如果有进位 直接追加
        if (carry > 0){
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
