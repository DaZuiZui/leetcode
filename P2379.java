public class P2379 {
    public static void main(String[] args) {
        System.out.println(new P2379().minimumRecolors("WBWBBBW", 2));
    }

    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int res = Integer.MAX_VALUE;
        int tmp = 0;
        //初始化滑动窗口
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W'){
                tmp++;
            }
        }
        res =Math.min(res,tmp);

        //滑动窗口移动
        for (int i = k; i < n; i++) {
            if (blocks.charAt(i -k) == 'W'){
                tmp--;
            }

            if (blocks.charAt(i) == 'W'){
                tmp++;
            }
            res = Math.min(res,tmp);
        }

        return res;
    }
}
