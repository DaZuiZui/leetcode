package weekly335;

public class P1 {
    public static void main(String[] args) {
        System.out.println(new P1().passThePillow(18, 38));
    }

    public int passThePillow(int n, int time) {
        boolean b = true;
        int res = 1;

        for (int i = 1; i <= time; i++) {
            if (res  == n){
                b = false;
            }else if (res == 1){
                b = true;
            }
            if (b){
                res++;
            }else{
                res--;
            }
        }
        return res;
    }
}
