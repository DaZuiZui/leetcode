import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P1436 {
    public static void main(String[] args) {

    }

    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> path : paths) {
            path.add(path.get(0));
        }

        for (List<String> path : paths) {
            if (!set.contains(path.get(1))){
                return path.get(1);
            }
        }
        return "";
    }
}
