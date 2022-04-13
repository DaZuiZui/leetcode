package leccod;

import java.util.HashMap;

public class P243 {
    public static void main(String[] args) {

    }

    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int minDistance = wordsDict.length;
        for (int i = 0; i < wordsDict.length; i++) {
             if (wordsDict[i].equals(word1)){
                 for (int j = 0; j < wordsDict.length; j++) {
                     if (wordsDict[j].equals(word2)){
                         minDistance= Math.min(minDistance, Math.abs(i-j));
                     }
                 }
             }
        }

        return minDistance;
    }
}
