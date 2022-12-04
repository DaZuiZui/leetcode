import java.util.Arrays;

public class P6254 {
    public static void main(String[] args) {
        System.out.println(new P6254().dividePlayers(new int[]{1,1,2,3}));
    }

    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        int l = 0;
        int r = n-1;
        long sum =0;
        long first = skill[l++] + skill[r--];
        sum += skill[n-1] * skill[0];
        while(l < r){
            long tmp = 0;
            long tmpA  = skill[l++];
            long tmpB  = skill[r--];
            tmp = tmpA + tmpB;
            if (tmp != first){
                return -1;
            }
            sum += tmpA * tmpB;
        }

        return sum;
    }
}
