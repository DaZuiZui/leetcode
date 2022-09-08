public class P667 {
    public static void main(String[] args) {

    }

    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        int index =0;
        for (int i = 1; i < n -k; i++) {
            res[index++] = i;
        }

        for (int i = n - k,j = n; i <= j ;  i++,--j) {
            res[index++] = i;
            if (i != j){
                res[index++] =j ;
            }
        }

        return res;
    }
}
