public class P1754 {
    public static void main(String[] args) {
        //System.out.println("bcb".compareTo("abcc"));
        System.out.println(new P1754().largestMerge("abcabc", "abdcaba"));
    }
    public String largestMerge(String word1, String word2) {
        int point1 = 0;
        int point2 = 0;
        int length1 = word1.length();
        int length2 = word2.length();
        StringBuilder res = new StringBuilder();
        while (point1 <length1 && point2 < length2){
            //长度相等
            if (word1.substring(point1).compareTo(word2.substring(point2)) > 0){
                res.append(word1.charAt(point1++));
            }else{
                res.append(word2.charAt(point2++));
            }
        }

        if (point1 < length1){
            res.append(word1.substring(point1));
        }else if (point2 < length2){
            res.append(word2.substring(point2));
        }

        return res.toString();
    }
}
