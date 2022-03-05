package leccod;

public class P744 {
    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (letter > target){
                return letter;
            }
        }

        return target;
    }
}
