package leccod;

public class P5 {
    public static void main(String[] args) {
        System.out.println(new P5().longestPalindrome("abcda"));
    }

    public String longestPalindrome(String s) {
        if (s.length() < 2){
            return s;
        }
        int end = 1;        //默认回文长度是1
        int sta = 0;

        boolean[][] b = new boolean[s.length()][s.length()];

        //对角线设置为true
        for (int i = 0; i < s.length(); i++) {
            b[i][i] = true;
        }

        for (int i = 1; i < s.length() ; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) != s.charAt(j)){
                    b[j][i] = false;
                }else{
                    // a b c b
                    // 0 1 2 3
                    //意思就是如果<3 会出现aba bb 这样情况
                    if (i - j  < 3){
                        b[j][i] = true;
                    }else{
                        b[j][i] = b[j+1][i-1];
                    }
                }

                // b a b a d
                //
                // 0 1 2 3
                if (b[j][i] && i-j+1 > end){
                    end = i-j+1;
                    sta = j ;
                }
            }
        }

        return s.substring(sta,sta+end);
    }
}
