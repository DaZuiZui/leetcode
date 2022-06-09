package leccod;

public class P1662 {
    public static void main(String[] args) {

    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder stringBuilder1 = new StringBuilder();
        for (String s : word1) {
            stringBuilder1.append(s);
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        for (String s : word2) {
            stringBuilder2.append(s);
        }
        System.out.println(stringBuilder1.toString());
        System.out.println(stringBuilder2.toString());

        return stringBuilder1.toString().equals(stringBuilder2.toString());
    }
}
