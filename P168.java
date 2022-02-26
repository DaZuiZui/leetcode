package leccod;

public class P168 {
    public static void main(String[] args) {

    }

    public String convertToTitle(int columnNumber) {
        if (columnNumber <0){
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (columnNumber>0){
            columnNumber --;
            stringBuilder.append((char) (columnNumber%26 + 'A'));
            columnNumber = columnNumber/26;
        }
        return stringBuilder.reverse().toString();
    }
}
