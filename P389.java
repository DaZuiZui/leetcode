package leccod;

public class P389 {
    public static void main(String[] args) {
        System.out.println(new P389().findTheDifference("abcd", "abecd"));
    }

    public char findTheDifference(String s, String t) {

        return (char) (t.chars().sum() - s.chars().sum());


    }
}
