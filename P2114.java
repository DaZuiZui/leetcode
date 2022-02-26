package leccod;

public class P2114 {
    public static void main(String[] args) {
        System.out.println(new P2114().mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));


    }

    public int mostWordsFound(String[] sentences) {
        int max = sentences[0].split(" ").length;

        for (int i = 1; i < sentences.length; i++) {
            max = Math.max(sentences[i].split(" ").length,max);
        }
        return max;
    }
}
