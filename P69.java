package leccod;

public class P69 {
    public static void main(String[] args) {

    }

    public int mySqrt(int x) {
        int l = 0,r = x,res =0;
        while (l <= r){
            int mid = l +(r-l) /2;
            if ((long) mid * mid  <=x){
                res = mid;
                l=mid+1;
            }else{
                r =mid-1;
            }
        }
        return res;
    }
}
