package leccod;

public class P32 {
    public static void main(String[] args) {
        System.out.println(new P32().longestValidParentheses("()"));
    }

    public int longestValidParentheses(String s) {
        int[] dp = new int[s.length()];
        int maxnum = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')'){
                if (s.charAt(i-1) == '('){
                    if (i < 2){
                        dp[i] = 2;
                    }else {
                        /**
                         * i-2 要不就是无效，或者为0的真实数据
                         *     如果不为0那么就是合法连续数据累加即可。
                         */
                        dp[i] = dp[i-2]+2;
                    }

                }
                /**
                 * 如果不满足()的情况 可能会出现 ))的情况
                 *  s.charAt(i - dp[i-1] -1) 是判断是否存在与该下标的）对接的(，如果有就满足
                 */
                else if (i - dp[i-1] -1 >= 0 && s.charAt(i - dp[i-1] -1) == '(') {
                    //如果满足此if那么前一个肯定是合法的) 所以出现了dp[i-1]
                    dp[i] = dp[i - 1];
                    //累计合法的数据且连续
                    //如果满足i - dp[i-1] >= 2 那么就可能(())类型前面存在()的数据， 例如()((()))
                    //但是只有i为最后一个)的时候才能探测到()的类型，为其他的时候就探测为0
                    if (i - dp[i - 1] >= 2) {
                        //i - dp[i-1] 是找到 与s.chatAt(i-1)对称的(
                        //i - dp[i-1]-1 是找到 与s.chatAt(i)对称的(
                        //i - dp[i-1]-2 是找到是否有连续的如()(()) 找例子中的第一个)的数值
                        dp[i] += dp[i - dp[i - 1] - 2];
                    }

                    dp[i] += 2;
                }
            }
            maxnum = Math.max(dp[i],maxnum);
        }

        return maxnum;
    }
}
