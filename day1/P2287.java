package day1;

public class P2287 {
    public static void main(String[] args) {
        System.out.println(new P2287().rearrangeCharacters("abbaccaddaeea", "aaaaa"));
    }

    public int rearrangeCharacters(String s, String target) {
        int res = Integer.MAX_VALUE;
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c -'a']++;
        }
        int[] arr1 = new int[26];
        for (char c : target.toCharArray()) {
            arr1[c-'a']++;
        }

        for (char c : target.toCharArray()) {
            if (arr[c - 'a'] == 0){
                return 0;
            }else{
                //查看是否可以构成
                if (arr1[c-'a'] > arr[c-'a']){
                    return 0;
                }
                //System.out.println(arr[c - 'a']);
                res = Math.min(res,arr[c - 'a'] / arr1[c-'a']);
            }
        }

        return res;
    }
}
