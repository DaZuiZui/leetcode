public class P825 {
    public static void main(String[] args) {
        System.out.println(new P825().numFriendRequests(new int[]{20,30,100,110,120}));
    }

    public int numFriendRequests(int[] ages) {
        int n = ages.length;
        int[] arr = new int[121];
        int res =0 ;

        for (int i = 0; i < n; i++) {
            arr[ages[i]]++;
        }

        for (int x = 1; x <= 120 ; x++) {
            if (arr[x] == 0){
                continue;
            }
            for (int y = 1; y <= 120 ; y++) {
                if (y <= 0.5 * x + 7){
                    continue;
                }

                if (x < y){
                    break;
                }

                if (y > 100 && x < 100){
                    break;
                }

                if (x == y){
                    res += arr[x] * (arr[x]-1);
                }else{
                    res += arr[x] * arr[y];
                }
            }
        }

        return res;
    }
}
