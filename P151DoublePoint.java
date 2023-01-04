public class P151DoublePoint {
    public static void main(String[] args) {
        System.out.println(new P151DoublePoint().reverseWords("  hello world  "));
    }

    public String reverseWords(String s) {
        //去除空格
        StringBuilder stringBuilder =  removeSpace(s);
        //反转字符串
        reverseStringBuilder(stringBuilder,0,stringBuilder.length() - 1);
        //反转每个单词
        reverseEachWord(stringBuilder);
        return stringBuilder.toString();
    }

    /**
     * 反转每一个单词
     */
    public void reverseEachWord(StringBuilder stringBuilder){
        int l = 0;
        int r = 1;
        int n = stringBuilder.length();
        while (l < n){
            //如果不是空格间隔，那么就r指针++；
            //System.out.println(r + " and "+ n);
            while (r < n  && stringBuilder.charAt(r) != ' '){
                r++;
            }
            //反转字符串
            reverseStringBuilder(stringBuilder,l,r-1);
            //指针偏移
            l = r + 1;
            r = l + 1;
        }
    }

    /**
     * 反转字符串
     * @param stringBuilder
     */
    public void reverseStringBuilder(StringBuilder stringBuilder,int l,int r){
        while (l < r){
            char c = stringBuilder.charAt(l);
            stringBuilder.setCharAt(l,stringBuilder.charAt(r));
            stringBuilder.setCharAt(r,c);
            l++;
            r--;
        }
    }

    /**
     * 移除多余的空格
     * @param s  字符串
     * @return
     */
    public StringBuilder removeSpace(String s){
        int n = s.length();
        int l = 0;
        int r = s.length() -1;
        //删除左侧多余空格
        while(l < n && s.charAt(l) == ' '){
            l++;
        }
        //删除右侧多余的空格
        while (r >= 0 && s.charAt(r) == ' '){
            r--;
        }
        //查看中间的字符串是否有多余的
        StringBuilder stringBuilder = new StringBuilder();
        while (l <= r){
            //如果当前不是空格就录入，或者当前是空格但是stringBuilder的最后一个不是空格录入
            //如果满足s.charAt(l) != ' ' 就是英文单词需要录入
            //如果满足stringBuilder.charAt(stringBuilder.length() -1) != ' ' 就说明需要一个空格作为单词之间的间隔
            if (s.charAt(l) != ' ' || stringBuilder.charAt(stringBuilder.length() -1) != ' '){
                stringBuilder.append(s.charAt(l));
            }
            l++;
        }

        return stringBuilder;
    }

}
