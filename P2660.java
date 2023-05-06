public class P2660 {
    public static void main(String[] args) {
        System.out.println(new P2660().isWinner(
                new int[]{10,2,2,3},
                new int[]{3,8,4,5}
        ));
    }

    public int isWinner(int[] player1, int[] player2) {
        int sum1 = 0;
        int sum2 = 0;
        int n = player1.length;
        for (int i = 0; i < n; i++) {
            if ( i < 2){
                if (i > 0) {
                    if (player1[i -1] == 10){
                        sum1 += player1[i] * 2;
                    }else{
                        sum1 += player1[i];
                    }

                    if (player2[i - 1] == 10){
                        sum2 += player2[i] * 2;
                    }else{
                        sum2 += player2[i];
                    }
                }else{
                    sum1 += player1[i];
                    sum2 += player2[i];
                }

            }else{
                if (player1[i-1] == 10 || player1[i-2] == 10){
                    sum1 += player1[i] * 2;
                }else{
                    sum1 += player1[i];
                }

                if (player2[i-1] == 10 || player2[i-2] == 10){
                    sum2 += player2[i] * 2;
                }else{
                    sum2 += player2[i];
                }
            }
        }

        return sum1 == sum2 ? 0 : sum1 > sum2 ? 1 : 2;
    }
}
