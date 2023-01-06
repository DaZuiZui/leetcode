public class P28KMP {
    public static void main(String[] args) {
        System.out.println(new P28KMP().strStr("ababaabbbbababbaabaaabaabbaaaabbabaabbbbbbabbaabbabbbabbbbbaaabaababbbaabbbabbbaabbbbaaabbababbabbbabaaabbaabbabababbbaaaaaaababbabaababaabbbbaaabbbabb",
                "abbabbbabaa"));
    }

    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int[] arr = new int[n];
        //获取前缀表
        getPrefix(arr,needle);
        //开始判断
        int pointB = 0;
        for (int pointA = 0; pointA < haystack.length() ; pointA++) {
            //查看两个字符串是否相等
            while (pointB > 0 && haystack.charAt(pointA) != needle.charAt(pointB)){
                pointB = arr[pointB-1];
            }
            //如果相等
            if (haystack.charAt(pointA) == needle.charAt(pointB)){
                pointB++;
            }
            if (pointB == n){
                //这里+1是因为如果最后一个字母相等了pointB会比PointA大一
                return pointA - n + 1;
            }
        }

        return -1;
    }

    public void getPrefix(int[] prefix,String s){
        int l = 0;
        /**
         * 通过查看前后缀是否相同找出对应前缀表
         */
        for (int r = 1; r < prefix.length; r++) {
            //查看前缀和后缀是不相同的情况
            while (l > 0 && s.charAt(l) != s.charAt(r)){
                l = prefix[l-1];
            }
            //前缀和后缀相等的情绪
            if (s.charAt(l) == s.charAt(r)){
                l++;
            }

            prefix[r] = l;
        }
    }
}
