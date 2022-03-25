package leccod;

public class P172 {
    public int trailingZeroes(int n) {
        int c = 0;
        while(n > 0){
            c += n/5;
            n/=5;
        }
        return c;
    }
}
