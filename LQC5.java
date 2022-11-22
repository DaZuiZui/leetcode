public class LQC5 {
    public static void main(String[] args) {
        long res =0;
        for (int i = 2022; i <= 2022222022 ; i++) {
            StringBuilder stringBuilder = new StringBuilder(i);
            if (stringBuilder.toString().equals(stringBuilder.reverse().toString())){
                res++;
            }
            System.out.println(i);
        }

        System.out.println(res);
    }
}
