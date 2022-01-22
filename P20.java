package leccod;

public class P20 {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        int length = s.length() /2;

        for (int i = 0; i < length; i++) {
            s = s.replace("()","").replace("[]","").replace("{}","");
        }

        return s.length() == 0;
    }
}
