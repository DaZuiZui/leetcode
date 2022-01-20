package leccod;

public class P14 {
    public static void main(String[] args) {
        String[] str = {"aa","aa"};
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix1(String[] strs) {
        return "";
    }

    public static String longestCommonPrefix(String[] strs) {

        String str = strs[0];
        int indexleng = 1;
        String returnStr = "";
        boolean switchButton = false;
        //如果strs的长度为1
        if (strs.length == 1){
            returnStr = strs[0];
        }


        for (int i = 1; i < strs.length; ) {

            if (
                    indexleng <= str.length()  &&  indexleng <= strs[i].length()
                    && str.substring(0,indexleng).equals(strs[i].substring(0,indexleng))) {
                /******/
                switchButton  = true;
            }else{
                switchButton = false;
                break;
            }

            if (switchButton&&i == strs.length-1){
                i=1;
                returnStr = str.substring(0,indexleng);
                indexleng++;
                continue;
            }
            i++;
        }
        return returnStr;
    }
}
