public class Offer46 {
    public static void main(String[] args) {

    }

    public int translateNum(int num) {
        if (num < 10 ){
            return 1;
        }
        String str = new String(num+"");
        int n = str.length();
        int[] dp = new int[n];
        char[] arr  =str.toCharArray();
        //第一个数字肯定只有1种情况
        dp[0] = 1;
        //判断是否存在dp【1】有两种方法
        dp[1] = arr[0] - '0' == 1 || (arr[0] - '0'== 2 && arr[1]-'0' <= 5) ? 2 : dp[0];

        for (int i = 2; i < n; i++) {
            if (arr[i-1]-'0' == 1 || (arr[i-1]-'0' == 2 && arr[i] - '0'<= 5)){
                dp[i] = dp[i-1] + dp[i-2];
            }else{
                dp[i] = dp[i-1];
            }
        }


        return dp[n-1];
    }
}
