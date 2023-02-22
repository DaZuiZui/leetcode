import java.util.ArrayList;
import java.util.List;

public class P592 {
    public static void main(String[] args) {
        System.out.println(new P592().fractionAddition("-1/2-1/2-1/2"));
        //System.out.println(new P592().gcd(1, 2));
    }

    public String fractionAddition(String expression) {
        String res = "";
        Integer fenzi = 0;
        Integer fenmu = 0;
        List<String> list = new ArrayList<>();
        int l = 0,r =0;
        for (; r < expression.length(); r++) {
            if (expression.charAt(r) =='+' || expression.charAt(r)=='-' && r != l){
                list.add(expression.substring(l,r));
                l = r;
            }
        }
        if (l != r && r == expression.length()){
            list.add(expression.substring(l,r));
        }


        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            String[] split = s.split("/");
            Integer fz = Integer.valueOf(split[0]);
            Integer fm = Integer.valueOf(split[1]);

            if (fenmu == 0){
                fenzi = fz;
                fenmu = fm;
            }
            //为0的情况
            else if (fz == 0 || fm == 0){
                continue;
            }
            //双方都为负数的情况
            else if (fz < 0 && fm < 0){
                //寻找他们最大公倍数
                Integer lcmOfMun = lcm(fenmu, fm);
                //查看加数扩大了几倍
                int beishu1 = lcmOfMun / fenmu;
                fenzi *= beishu1;
                //查看被加数扩大了几倍
                int beishu2 = lcmOfMun / fm;
                fz *=  beishu2;
                fenmu = lcmOfMun;
                fenzi = fenzi + fz;
            }
            //都为正数的情况
            else if (fz > 0 && fm > 0){
                //寻找他们最大公倍数
                Integer lcmOfMun = lcm(fenmu, fm);
                //查看加数扩大了几倍
                int beishu1 = lcmOfMun / fenmu;
                fenzi *= beishu1;
                //查看被加数扩大了几倍
                int beishu2 = lcmOfMun / fm;
                fz *=  beishu2;
                fenmu = lcmOfMun;
                fenzi = fenzi + fz;
            }else {
                //一正一负
                //寻找他们最大公倍数
                Integer lcmOfMun = lcm(fenmu, fm);
                //查看加数扩大了几倍
                int beishu1 = lcmOfMun / fenmu;
                fenzi *= beishu1;
                //查看被加数扩大了几倍
                int beishu2 = lcmOfMun / fm;
                fz *= beishu2;
                fenmu = lcmOfMun;
                fenzi = fenzi - Math.abs(fz);
            }

            //化简
            int gcd = gcd(Math.abs(fenmu), Math.abs(fenzi));
            fenmu /= gcd;
            fenzi /= gcd;
        }

        if (fenzi == 0 || fenmu == 0) return "0/1";
        if (fenzi < 0 && fenmu < 0) return Math.abs(fenzi) + "/" +Math.abs(fenmu);
        if (fenmu < 0 || fenzi < 0) return "-"+Math.abs(fenzi) + "/" +Math.abs(fenmu);
        return Math.abs(fenzi) + "/" +Math.abs(fenmu);
    }

    /**
     * 最小公倍数
     * @param a
     * @param b
     * @return
     */
    public int lcm(int a,int b){
        return a * b / gcd(a,b);
    }

    /**
     * 最大公倍数
     * @param a
     * @param b
     * @return
     */
    public int gcd(int a,int b){
        return b != 0 ? gcd(b, a % b) : a;
    }
}
