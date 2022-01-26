package leccod;

public class P1137 {
    public static void main(String[] args) {
        System.out.println(new P1137().tribonacci(25));
    }

    public int tribonacci(int n) {
        if(n==1 || n==2){
            return 1;
        }else if(n== 0){
            return 0;
        }
        int[] arr = new int[n+1];
        arr[1] = 1;arr[2] =1;
        arr[0] = 0;

        for (int i = 3 ;i <= n ;i++){
            arr[i] = arr[i-1] + arr[i-2] +arr[i-3];
        }

        return arr[n];
    }
}
