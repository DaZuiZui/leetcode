import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class P2446 {
    public static void main(String[] args) {
        System.out.println(new P2446().haveConflict(new String[]{"10:00", "11:00"}, new String[]{"14:00", "15:00"}));
    }

    public boolean haveConflict(String[] event1, String[] event2) {
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> listtwo = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        //查看第一个
        for (int i = 0; i < event1.length; i++) {
            int fen = Integer.parseInt(event1[i].substring(0,2)) * 60;
            fen += Integer.parseInt(event1[i].substring(3));
            list1.add(fen);
        }
        list.add(new ArrayList<>(list1));

        list1.clear();
        //查看第二个时间戳
        for (int i = 0; i < event2.length; i++) {
            int fen = Integer.parseInt(event2[i].substring(0,2)) * 60;
            fen += Integer.parseInt(event2[i].substring(3));
            //查看是否包含在list1
            if (fen <= list.get(0).get(1) && fen >= list.get(0).get(0)){
                return true;
            }
            list1.add(fen);
        }
        listtwo.add(new ArrayList<>(list1));

        //查看list是否在listtwo中
        for (Integer integer : list.get(0)) {
            if (integer <= listtwo.get(0).get(1) && integer >= listtwo.get(0).get(0)){
                return true;
            }
        }


        return false;
    }
}
