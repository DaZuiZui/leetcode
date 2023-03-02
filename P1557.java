import java.util.ArrayList;
import java.util.List;

public class P1557 {
    public static void main(String[] args) {

    }

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> res = new ArrayList<>();
        int[] arr = new int[n];
        for (List<Integer> edge : edges) {
            arr[edge.get(1)]++;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0){
                res.add(i);
            }
        }
        return res;
    }
}
