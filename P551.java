package leccod;

public class P551 {
    public static void main(String[] args) {

    }

    public boolean checkRecord(String s) {
        int countA = 0;
        int last = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A'){
                countA++;
                if (countA >= 2) {
                    return false;
                }
            }

            if (s.charAt(i) == 'L'){
                last++;
                if (last>3) {
                    return false;
                }
            }else{
                last =0;
            }

        }
        return true;
    }
}
