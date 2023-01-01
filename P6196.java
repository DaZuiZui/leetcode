package l;

public class P6196 {
    public static void main(String[] args) {
        System.out.println(new P6196().minimumPartition("1", 1));
    }

    public int minimumPartition(String s, int k) {
        int n = s.length();
        if (n == 1){
            if (Integer.valueOf(s) <= k){
                return 1;
            }else {
                return -1;
            }
        }
        int res =0;
        for (int r = 0,l=0; r <n ; r++) {
            //查看是否满足返回-1的情况
            Integer a = Integer.valueOf(s.charAt(r)+"");
            if (a > k ){
                return -1;
            }

            Long tmp = Long.valueOf(s.substring(l,r+1));
            if (tmp > k){
                res++;
                l = r;
                r--;
            }
        }

        return res+1;
    }
}
