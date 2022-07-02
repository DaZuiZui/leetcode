public class P1374 {
    public static void main(String[] args) {

    }

    public String generateTheString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if ((n&1)==0){
            stringBuilder.append("a");
            n--;
        }

        for (int i = 0; i < n; i++) {
            stringBuilder.append("b");
        }
        return stringBuilder.toString();
    }
}
