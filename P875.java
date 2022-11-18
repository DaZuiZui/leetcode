public class P875 {
    public static void main(String[] args) {

    }

    public int minEatingSpeed(int[] piles, int h) {
        int l = 0,r = 0;
        //获取需要吃没这些香蕉最大的K
        for (int pile : piles) {
            r = Math.max(r,pile);
        }

        while(l < r){
            int mid = l+(r-l)/2;
            if (check(piles,h,mid)){
                r = mid;
            }else{
                l = mid +1;
            }
        }

        return l;
    }

    /**
     * 校验
     * @param piles
     * @param h
     * @param speed
     * @return
     */
    public boolean check(int[] piles,int h ,int speed){
        long cur  =0;
        for (int pile : piles) {
            cur += Math.ceil(pile * 1.0 / speed);
        }

        return cur <= h;
    }
}
