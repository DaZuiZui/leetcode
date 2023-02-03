import java.util.Arrays;

public class P940 {
    public static void main(String[] args) {
        System.out.println(new P940().distinctSubseqII("zchmliaqdgvwncfatcfivphddpzjkgyygueikthqzyeeiebczqbqhdytkoawkehkbizdmcnilcjjlpoeoqqoqpswtqdpvszfaksn"));
    }

    public int distinctSubseqII(String s) {
        int mod = (int) (1e9+7);
        long[] dp = new long[26];
        for (char c : s.toCharArray()) {
            dp[c-'a'] = (1+ Arrays.stream(dp).sum()) % mod;
        }

        return (int) (Arrays.stream(dp).sum() % mod);
    }
}
