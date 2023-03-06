import java.util.Arrays;

public class P881 {
    public static void main(String[] args) {
        System.out.println(new P881().numRescueBoats(new int[]{1, 2}, 3));
    }

    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);

        int l = 0;
        int res =0;
        int r = n-1;
        while (l <= r){
            if (l == r){
               res++;
            }
            if (people[l] + people[r] > limit){
                r--;
                res++;
            }else {
                r--;
                l++;
                res++;
            }
        }

        return res;
    }
}
