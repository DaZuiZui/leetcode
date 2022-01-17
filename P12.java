package leccod;

public class P12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(400));
    }

    public static String intToRoman(int num) {
        String string = "";
        //计算千位

            //计算千位
            string += jisuanqianwei(num);
            //计算百位
            string += jisuanbaiwei(num);

            //计算十位
            string += jisuanshiwei(num);
            //计算个位
            string += jisaungewei(num);

        //计算百位

        return string;
    }

    //计算各位
    public static String jisaungewei(int num){
        //获取百位
        num -= (num / 1000)*1000;
        //获取十位
        num -= (num/100)*100;
        //获取各位
        num -= (num/10)*10;

        if (num > 0){
            if (num ==9){
                return "IX";
            }else if (num == 4){
                return "IV";
            }

            String str = "";
            if (num >= 5){
                num-=5;
                str+="V";
            }

            for (int i = 0; i < num; i++) {
                str+="I";
            }
            return str;
        }

        return "";
    }

    //计算十位
    public static String jisuanshiwei(int num){
        //获取百位
        num -= (num / 1000)*1000;
        //获取十位
        num -= (num/100)*100;

        if (num >0){
            if (num / 10 == 9){
                return "XC";
            }else if (num /10 ==4){
                return "XL";
            }

            String str = "";
            if (num >= 50){
                num-=50;
                str+="L";
            }

            for (int i = 0; i < num / 10; i++) {
                str += "X";
            }

            return str;
        }

        return "";
    }


    //计算百位
    public static String jisuanbaiwei(int num){
        //获取百位
        num -= (num / 1000)*1000;
        if (num > 0){
            if (num/100 == 9){
                return "CM";
            }else if(num/100 == 4){
                return "CD";
            }

            String str=  "";
            if (num >= 500){
                num -=500;
                str+="D";
            }

            for (int i = 0; i < num /100; i++) {
                str +="C";
            }

            return str;
        }
        return "";
    }

    //计算千位
    public static String jisuanqianwei(int num){
        String  str = "";
        for (int i = 0; i < num / 1000; i++) {
            str+="M";
        }

        return str;
    }
}
