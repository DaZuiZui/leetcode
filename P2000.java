package leccod;

public class P2000 {
    public static void main(String[] args) {
        System.out.println(new P2000().reversePrefix("abcdefd", 'd'));
    }

    public String reversePrefix(String word, char ch) {
        if (word.length() == 0){
            return "";
        }

        String returnString = "";

        for (int i = word.indexOf(ch); i >= 0 ; i--) {
            returnString += word.charAt(i);
        }

        returnString+=word.substring(word.indexOf(ch)+1,word.length());

        return returnString;
    }
}
