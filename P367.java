package leccod;

public class P367 {
    public static void main(String[] args) {
        System.out.println(new P367().isPerfectSquare(14));
    }

    public boolean isPerfectSquare(int num) {
        if (num == 1){
            return true;
        }else if (num == 0){
            return false;
        }

        int res =  mySqrt(num);

        return res * res == num;
    }

    public int mySqrt(int x) {
        int l =0,r=x,res =0;
        while (l <= r){
            int mid = l + (r-l)/2;
            if ((long) mid *mid <= x){
                res = mid;
                l=mid+1;
            }else{
                r = mid-1;
            }
        }
        return res;
    }
}
