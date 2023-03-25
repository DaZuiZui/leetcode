public class LCP61 {
    public static void main(String[] args) {
        System.out.println(new LCP61().temperatureTrend(
                new int[]{5,10,16,-6,15,11,3}, new int[]{16,22,23,23,25,3,-16}));
    }

    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        int n = temperatureA.length;
        int[] dp1 = new int[n];
        for (int i = 1; i < n; i++) {
            if (temperatureA[i] > temperatureA[i-1]){
                dp1[i] = 1;
            }else if (temperatureA[i] == temperatureA[i-1]){
                dp1[i] = 0;
            }else{
                dp1[i] = -1;
            }
        }

        int[] dp2 = new int[n];
        for (int i = 1; i < n; i++) {
            if (temperatureB[i] > temperatureB[i-1]){
                dp2[i] = 1;
            }else if (temperatureB[i] == temperatureB[i-1]){
                dp2[i] = 0;
            }else{
                dp2[i] = -1;
            }
        }

        int res = 0;
        for (int l = 1 , r = 1; l < n; ) {
            int tmp = 0;
            //相同
            while (r < n && dp1[r] == dp2[r]){
                r++;
                tmp++;
            }
            res = Math.max(res,tmp);

            while (r < n && dp1[r] != dp2[r]){
                r++;
            }

            l = r;
        }

        return res;
    }
}
