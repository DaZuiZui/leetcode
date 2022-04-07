package leccod;

public class P2224 {
    public static void main(String[] args) {
        //System.out.println(2/10);
        new P2224().convertTime("00:00","23:59");
    }

    public int convertTime(String current, String correct) {
        String[] cur=current.split(":");
        String[] cor=correct.split(":");
        int hour1=Integer.parseInt(cur[0]);
        int hour2=Integer.parseInt(cor[0]);
        int minute1=Integer.parseInt(cur[1]);
        int minute2=Integer.parseInt(cor[1]);
        int dis = (hour2-hour1)*60+(minute2-minute1);
        int res =0;
        int[] Df=new int[]{60,15,5,1};
        for (int d: Df){
            res+=(dis/d);
            dis=dis-(dis/d)*d;
        }


        return res;
    }
}
