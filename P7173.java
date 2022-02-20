package leccod;


public class P7173 {
    public static void main(String[] args) {
        System.out.println(new P7173().isOneBitCharacter(new int[]{1,0,0}));
    }

    /**
     * 悟道九霄分享的思路
     * 1 倒序遍历数组
     * 2 最后一位是 1，则一定不符合题意，返回 false
     * 3 最后一位是 0 时，从倒数第二位遍历数组，记录连续 1 的个数
     *     3.1 个数为奇数，则最后一个字符必定不是一位字符，返回 false
     *     3.2 个数为偶数，则最后一个字符必定是一位字符，返回 true
     */
    public boolean isOneBitCharacter(int[] bits) {
        if (bits[bits.length-1] == 1){
            return false;
        }

        int count = 0;
        for (int i = bits.length-2; i >= 0 ; i--) {
            if (bits[i] == 1){
                count++;
            }else{
                break;
            }
        }

        return count % 2 == 0;
    }

}
