public class P1184 {
    public static void main(String[] args) {
        new P1184().distanceBetweenBusStops(new int[]{1,2,3,4},0,3);
    }

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int res = 0;
        int r = 0;
        int l = 0;
        //从起点下标往右遍历
        for (int i = start;  ; i++) {
            //查看是否到达公交站
            if (i % distance.length == destination){
                break;
            }
            r += distance[i % distance.length];
        }

        //从起点往左
        for (int i = start-1;  ; i--) {
            int index = i;
            if (i < 0){
                index = distance.length + index;
            }
            //System.err.println(index);
            if (index % distance.length == destination){
                l += distance[index];
                break;
            }
            //System.err.println(distance[index] + "adn "+index);
            l += distance[index];
        }


        return Math.min(r,l);
    }
}
