package leccod;

public class P2047 {

    public static void main(String[] args) {
        P2047 p = new P2047();
        p.countValidWords(" 62   nvtk0wr4f  8 qt3r! w1ph 1l ,e0d 0n 2v 7c.  n06huu2n9 s9   ui4 nsr!d7olr  q-, vqdo!btpmtmui.bb83lf g .!v9-lg 2fyoykex uy5a 8v whvu8 .y sc5 -0n4 zo pfgju 5u 4 3x,3!wl  fv4   s  aig cf j1 a i  8m5o1  !u n!.1tz87d3 .9    n a3  .xb1p9f  b1i a j8s2 cugf l494cx1! hisceovf3 8d93 sg 4r.f1z9w   4- cb r97jo hln3s h2 o .  8dx08as7l!mcmc isa49afk i1 fk,s e !1 ln rt2vhu 4ks4zq c w  o- 6  5!.n8ten0 6mk 2k2y3e335,yj  h p3 5 -0  5g1c  tr49, ,qp9 -v p  7p4v110926wwr h x wklq u zo 16. !8  u63n0c l3 yckifu 1cgz t.i   lh w xa l,jt   hpi ng-gvtk8 9 j u9qfcd!2  kyu42v dmv.cst6i5fo rxhw4wvp2 1 okc8!  z aribcam0  cp-zp,!e x  agj-gb3 !om3934 k vnuo056h g7 t-6j! 8w8fncebuj-lq    inzqhw v39,  f e 9. 50 , ru3r  mbuab  6  wz dw79.av2xp . gbmy gc s6pi pra4fo9fwq k   j-ppy -3vpf   o k4hy3 -!..5s ,2 k5 j p38dtd   !i   b!fgj,nx qgif ");
        System.out.println(p.count);
    }

    int count = 0;
    public int countValidWords(String sentence) {
        help(sentence);

        return count;
    }
    public void help(String sentence){
        //获取空格第一次出现的位置
        int konggechuxain = sentence.indexOf(" ");
        String str= "";
        //更新字符串
        if (konggechuxain != -1){
            str = sentence.substring(0,konggechuxain);
        }else {
            str = sentence.substring(0,sentence.length());

        }


        if (legality(str)){
            if (str.length() != 0){

                count++;
            }
        }
        if (konggechuxain == -1){
            return ;
        }



        str = leftTrim(sentence.substring(konggechuxain,sentence.length()));



        help(str);
    }

    //判断是否合法
    public boolean legality(String str){
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){

            }else{
                if (i == (str.length() -1)){
                    //判断是否为字符
                    if ((str.charAt(i)+"").equals(",") || (str.charAt(i)+"").equals("!") || (str.charAt(i)+"").equals(".")){
                        return true;
                    }
                }

                if (i != 0 && i != str.length() -1){
                    if ((str.charAt(i)+"").equals("-") && c == 0){
                        if(str.charAt(i+1) >= 'a' && str.charAt(i+1) <= 'z'){
                            c++;
                            continue;
                        }

                    }
                }


                return false;
            }
        }

        return true;
    }


    //去除左侧空格
    public String leftTrim(String str){
        int index = 0;
        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i)+"").equals(" ")){

                index++;
            }else{
                break;
            }
        }
        return str.substring(index,str.length());
    }
}
