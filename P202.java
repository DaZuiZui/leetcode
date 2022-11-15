import java.util.HashSet;
import java.util.Set;

public class P202 {
    public static void main(String[] args) {
        System.out.println(new P202().isHappy(2));
    }


    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)){
            set.add(n);
            int tmp = 0;
            //get index 0th - n.length
            while (n > 0){
                tmp += (n % 10) * (n % 10);
                n /= 10;
            }
            n = tmp;
        }

        if(n == 1){
            return true;
        }
        return false;
    }
}
