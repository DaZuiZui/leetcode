package leccod;

public class P2180 {
    public static void main(String[] args) {
        System.out.println(new P2180().countEven(30));
    }

    public int countEven(int num) {
        int count =0;
        for (int i = 1; i <= num; i++) {
            count+= check(i) ? 1 :0;
        }
        return count;
    }

    public boolean check(int num){
        int checknum = 0;
        while (num >0){
            checknum += (num %10);
            num /=10;
        }

         return checknum % 2 == 0 ;
    }
}
