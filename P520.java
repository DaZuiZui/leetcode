package leccod;

public class P520 {
    public static void main(String[] args) {
        System.out.println(new P520().detectCapitalUse("G"));
    }

    public boolean detectCapitalUse(String word) {
        //判断第一个字符是否为小写
        if (word.charAt(0) <= 'z' && word.charAt(0) >= 'a'){
            //判断后面的单词是否为小写
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                    return false;
                }
            }
        }

        //判断第2个字符到最后一次是否都为小写，或者都为大写
        if (word.length() > 1){
            boolean b = word.charAt(1) >= 'a' && word.charAt(1) <= 'z' ? true : false;
            for (int i = 2; i < word.length(); i++) {
                if (b) {
                    if (word.charAt(i) <'a'){
                        return false;
                    }
                }else{
                    if (word.charAt(i) > 'Z'){
                        return false;
                    }
                }
            }
        }


        return true;
    }
}
