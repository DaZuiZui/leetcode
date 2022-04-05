package leccod;

public class OfferII069 {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxnumber = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (maxnumber < arr[i]){
                max =i;
                maxnumber= arr[i];
            }
        }
        return max;
    }
}
