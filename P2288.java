public class P2288 {
    public static void main(String[] args) {
       // System.out.println(602 * 0.09);
         System.out.println(new P2288().discountPrices("$2f", 50));
    }

    public String discountPrices(String sentence, int discount) {
        double dc =   discount * 1 / 100.0;

        StringBuilder stringBuilder = new StringBuilder();
        String[] chars = sentence.split(" ");
        for (int i = 0; i < chars.length; i++) {
            if (chars[i].charAt(0) != '$'){
                stringBuilder.append(chars[i]+" ");
                continue;
            }else{
                int index = chars[i].indexOf("$", 1);

                if (index == -1) {
                    if (chars[i].length() == 1) {
                        stringBuilder.append(chars[i]+" ");
                        continue;
                    }
                    if (check(chars[i].substring(1))) {
                        chars[i] = String.format("%.2f",Double.valueOf(chars[i].substring(1)) - Double.valueOf(chars[i].substring(1)) * dc);
                        stringBuilder.append("$"+chars[i]+" ");
                    }else{
                        stringBuilder.append(chars[i]+" ");
                        continue;
                    }
                }else{
                    stringBuilder.append(chars[i]+" ");
                    continue;
                }
            }
        }


        return stringBuilder.toString().trim();
    }

    public boolean check(String str){
       // System.out.println(str);
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) < '0' || str.charAt(i) >'9') return false;
        }
        return true;
    }
}
