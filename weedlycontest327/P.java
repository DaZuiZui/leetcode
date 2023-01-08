package weedlycontest327;

public class P {
    public static void main(String[] args) {
        System.out.println(new P().maximumCount(new int[]{2, -1, -1, 1, 2, 3}));
    }

    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg =0;
        for (int num : nums) {
            if (num > 0){
                pos++;
            }else if (num < 0){
                neg++;
            }
        }

        return Math.max(neg,pos);
    }
}
