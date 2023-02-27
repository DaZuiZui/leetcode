public class P1578 {
    public static void main(String[] args) {
        System.out.println(new P1578().minCost("aaabaa", new int[]{1,1,3,3,4,1}));
    }

    public int minCost(String colors, int[] neededTime) {
        int res =0 ;
        int n = colors.length();
        StringBuilder stringBuilder  = new StringBuilder(colors);
        for (int i = 1; i < n; i++) {
            if (stringBuilder.charAt(i) == stringBuilder.charAt(i-1)){

                if(neededTime[i] <= neededTime[i-1]){
                    res += neededTime[i];
                    neededTime[i] = neededTime[i-1];
                    stringBuilder.setCharAt(i,stringBuilder.charAt(i-1));
                }else{
                    res += neededTime[i-1];
                }
            }
        }

        return res;
    }
}
