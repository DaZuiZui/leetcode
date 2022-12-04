public class P6253 {
    public static void main(String[] args) {
        System.out.println(new P6253().isCircularSentence(new String("Leetcode")));
    }

    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");

        boolean res = true;
        //不是最后一个单词的情况
        int n = arr.length;
        int i = 0;
        for (; i < n-1; i++) {
            int lengthA = arr[i].length();
            int lengthB = arr[i+1].length();
            if (!(arr[i].charAt(lengthA-1) == arr[i+1].charAt(0))){
                res = false;
                break;
            }
        }

        //最后一个单词的情况
        int length = 0;
        length = arr[i].length();
        if (arr[0].charAt(0) != arr[i].charAt(length-1)){
            res = false;
        }

        return res;
    }
}
