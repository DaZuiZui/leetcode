package leccod;

import java.util.HashSet;
import java.util.Set;

public class P575 {
    public static void main(String[] args) {

    }

    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }

        return Math.min(set.size(),candyType.length/2);
    }
}
