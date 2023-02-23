public class P1423 {
    public static void main(String[] args) {
        System.out.println(new P1423().maxScore(new int[]{1,79,80,1,1,1,200,1}, 3));
    }

    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int res =0;
        int tmpres =0;
        //初始化滑动窗口
        for (int i = 0; i < k; i++) {
            tmpres += cardPoints[i];
        }
        res = Math.max(res,tmpres);
        int l = 0;
        int r = k-1;
        int z = n-1;
        for ( ; r >= l ; r--,z--){
            tmpres-=cardPoints[r];
            tmpres+=cardPoints[z];
            res = Math.max(res,tmpres);
        }

        return res;
    }
}
