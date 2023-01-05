public class P28 {
    public static void main(String[] args) {
        System.out.println(new P28().strStr("sadbutsad", "sad"));
    }

    public int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();
        //特殊情况
        if (m == 0 || n < m){
            return -1;
        }
        int pointA = 0; //负责ahystack的指针
        int pointB = 0; //负责needle的指针
        /**
         * 如果haystack的字符串包含needle，那么必须保证在[0,n -m + 1]区间内存在，如果不再这个区间内存在直接返回-1
         * 也就是pointA必须在这个区间内找到首字母和needle一致的，并且后续内容也等于needle
         * 关于为什么是n-m+1是因为
         * 假如
         *      haystack is abcde       length is 5
         *      needle   is ab          length is 2
         *      通过5-2 =3 我们得出我们从c坐标开始，但是我们的极限在 4，也就是说通过这个公式我们找到我们指针最后的一个开始位置
         */
        while(pointA < n - m +1){
            //找到首字母相同的数据
            while (pointA < n - m +1 && haystack.charAt(pointA) != needle.charAt(pointB)){
                pointA++;
            }
            //查看是否找到
            if (pointA >= n - m + 1){
                return -1;
            }
            //指针下移
            pointA++;
            pointB++;
            /**
             * 查看后续字符是否一致
             */
            while (pointA < n && pointB < m  && haystack.charAt(pointA) == needle.charAt(pointB)){
                pointA++;
                pointB++;
            }
            //查看是否找到
            if (pointB == m){

                return pointA - pointB;
            }
            //如果没有找到， 比如说pointA是从0开始判断的，那么就让pointA从1开始判断
            else{
                pointA -= pointB-1;
                pointB = 0;
            }
        }
        return -1;
    }
}
