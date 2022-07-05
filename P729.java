import java.util.ArrayList;
import java.util.List;

public class P729 {
    public static void main(String[] args) {

    }
}

class MyCalendar {
    List<int[]> list ;
    public MyCalendar() {
        list = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            int[] tmp = list.get(i);
            if(start >= tmp[0] && start < tmp[1] ||
               end   >= tmp[0] && end < tmp[1]
            ){
                return false;
            }
        }

        return true;
    }
}
