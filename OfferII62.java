import java.util.LinkedList;
import java.util.List;

public class OfferII62 {
    public static void main(String[] args) {
        System.out.println(new OfferII62().lastRemaining(10, 17));
    }

    public int lastRemaining(int n, int m) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() != 1){
            index += m;
            index -= 1;
            index %= list.size();
            list.remove(index);
        }

        return list.get(0);
    }
}
