package leccod;

public class P1672 {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum =0 ;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(sum,max);
        }


        return max;
    }
}
