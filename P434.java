package leccod;

public class P434 {
    public static void main(String[] args) {

    }

    public int countSegments(String s) {
        if (s.length() ==0){
            return 0;
        }
        String[] arr = s.split(" ");
        return arr.length;
    }
}
