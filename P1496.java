import java.util.HashSet;
import java.util.Set;

public class P1496 {
    public static void main(String[] args) {
        System.out.println(new P1496().isPathCrossing("NES"));
    }

    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int x =0;
        int y =0;
        set.add("0,0");
        char[] chars = path.toCharArray();
        for (char aChar : chars) {
            switch (aChar){
                case 'N':
                    y++;
                    if (!set.add(x+","+y)) {
                        return true;
                    }
                    break;
                case 'S':
                    y--;
                    if (!set.add(x+","+y)) {
                        return true;
                    }
                    break;
                case 'E':
                    x++;
                    if (!set.add(x+","+y)) {
                        return true;
                    }
                    break;
                case 'W':
                    x--;
                    if (!set.add(x+","+y)) {
                        return true;
                    }
                    break;
            }
        }

        return false;
    }
}
