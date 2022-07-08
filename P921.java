public class P921 {
    public static void main(String[] args) {

    }

    public int minAddToMakeValid(String s) {
        int l = 0;
        int r =0;
        for (char c : s.toCharArray()) {
            if (c == '('){
                r++;
            }else{
                if (l > 0){
                    r--;
                }else{
                    l++;
                }
            }
        }

        return r+l;
    }
}
