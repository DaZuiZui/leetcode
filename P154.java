package leccod;

import java.util.Arrays;

public class P154 {
    public static void main(String[] args) {

    }

    public int minArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}
