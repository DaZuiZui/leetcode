public class P6273 {
    public static void main(String[] args) {
        System.out.println(new P6273().captureForts(new int[]{-1,-1,0,1,0,0,1,-1,1,0}));
    }

    public int captureForts(int[] forts) {
        int n = forts.length;
        int res =0 ;

        for (int i = 0; i < n; i++) {
            if (forts[i] == 1) {
                int lsum = 0;
                int zzuizhong = 0;

                int rsum = 0;
                int rzuizhong = 0;
                //left
                for (int j = i-1; j >= 0; j--) {
                    if (forts[j] == 0) {
                        lsum++;
                    }
                    if (forts[j] == -1) {
                        zzuizhong = lsum;
                        break;
                    }
                    if (forts[j] == 1){
                        break;
                    }
                }

                for (int j = i+1; j < n; j++) {
                    if (forts[j] == 0) {
                        rsum++;
                    }
                    if (forts[j] == -1) {
                        rzuizhong = rsum;
                        break;
                    }
                    if (forts[j] == 1){
                        break;
                    }
                }

                res = Math.max(res, Math.max(rzuizhong, zzuizhong));
            }
        }
        
        return res;
    }
}
