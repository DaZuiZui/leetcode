package leccod;

public class P424 {
    public static void main(String[] args) {

    }

    public int characterReplacement(String s, int k) {
        int[] arr = new int[24];
        int l = 0;
        int maxchar =0;
        for (int r = 0; r < s.length(); r++) {
            arr[s.charAt(r) - 'A']++;
            //记录当前最大连续次数
            maxchar = Math.max(maxchar,arr[s.charAt(r)-'A']);

            //r - l + 1 当前连续次数
            //maxchar + k 最长连续次数
            // 确保l 永远和字符串长度保持最大连续长度的距离
            if (r - l + 1 > maxchar + k){
                arr[s.charAt(l++) - 'A']--;
            }
        }

        return s.length() - l;
    }
}
