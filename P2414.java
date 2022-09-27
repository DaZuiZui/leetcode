public class P2414 {
    public static void main(String[] args) {

    }

        public int longestContinuousSubstring(String s) {
            int res =1,current =1;
            int n = s.length();
            char[] chars = s.toCharArray();
            for (int i = 1; i < n; i++) {
                if (chars[i] - chars[i-1] == 1){
                    current++;
                }else{
                    current = 1;
                }
                res = Math.max(res,current);
            }

            return res;
        }
}
