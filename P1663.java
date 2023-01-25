public class P1663 {
    public static void main(String[] args) {
        System.out.println(new P1663().getSmallestString(5, 73));
    }


    public String getSmallestString(int n, int k) {
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 'a';
            k--;
        }

        for (int i = n-1; i >=0 ; i--) {
            if (k > 25){
                arr[i] = 'z';
                k -= 25;
            }else{
                arr[i] += k;
                k =0;
                break;
            }
        }
        return new String(arr);
    }


}
