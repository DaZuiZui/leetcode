public class P1839 {
    public static void main(String[] args) {

    }

    public int longestBeautifulSubstring(String word) {
        int n = word.length();
        int res =0 ;
        int type =1;
        for (int l = 0,r=0; r < n; r++) {
            if (word.charAt(r) < word.charAt(r-1)){
                l = r;
                type =1;
            }else if (word.charAt(r) > word.charAt(r-1)){
                type++;
            }
            if (type == 5){
                res = Math.max(res,r-l+1);
            }
        }

        return res;
    }
}
