package leccod;


public class P693 {
    public static void main(String[] args) {
        new P693().hasAlternatingBits(10);
    }

    public boolean hasAlternatingBits(int n) {
        int last = 100;
        while(n!=0){
            if (last == n%2){
                return false;
            }
            last = n%2;
            n/=2;
        }

        return true;
    }
}
