import java.util.Arrays;

public class P6328 {
    public static void main(String[] args) {
        System.out.println(new P6328().maximumCostSubstring("hghhghgghh",
                "hg", new int[]{2, 3}));
    }

    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int[] arr = new int[26];
        Arrays.fill(arr,1);
        int n = chars.length();
        for (int i = 0; i < chars.toCharArray().length; i++) {
            arr[chars.charAt(i) - 'a'] = vals[i];
        }
        int n1 = s.length();
        int[] dp = new int[n1];

        dp[0] = arr[s.charAt(0) - 'a'];
        dp[0] = Math.max(dp[0],0);
        int res = Math.max(0,dp[0]);

        int i = 0;
        for (char c : s.toCharArray()) {
            if (i ==0) {
                i++;
                continue;
            }
            int tmpi = c- 'a';
            dp[i] =Math.max(dp[i-1]+arr[tmpi],arr[tmpi]);
            res = Math.max(res,dp[i]);
            i++;
        }

        return res;
    }
}
