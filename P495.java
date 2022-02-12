package leccod;

public class P495 {
    public static void main(String[] args) {
        System.out.println(new P495().findPoisonedDuration(new int[]{1,2,3,4,5,6,7,8,9}, 1));
    }

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int times = 0;
        int end  = 0;

        for (int i = 0; i < timeSeries.length; i++) {
            if (end < timeSeries[i]){
                times+= duration;
            }else{
                times+= timeSeries[i] + duration - end;
            }

            end = timeSeries[i] +  duration;
        }
        
        return times;
    }
}
