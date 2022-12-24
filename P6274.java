import java.util.*;

public class P6274 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.sort((a,b)->{
            return a <b?1:-1;
        });
        System.err.println(list);

        System.out.println(new P6274().topStudents(
                new String[]{"utqjmq","f","phss","gbuq","qutww","irwkmv","kdr","cb"},
                new String[]{"tccrt","xyvvvjhf","igkhpx","l","hqdhsc","nrgfoaje","pwp","xgnrgm"},
                new String[]
                        {"idkcqa cb evdotmzx phss l xyvvvjhf l ccfa kdr l",

                                "jtswrxt lwj gryuxwdk fodazsucff pwp f tccrt qutww irwkmv lzohrrfahd","l f cb gornnntm tccrt xgnrgm gexhslh hqdhsc gbuq igkhpx","f igkhpx irwkmv fmvomibc estombev irwkmv xyvvvjhf irwkmv gbuq irwkmv"},
                new int[]{880134715,923494207,595896825,62500464},
             3
        ));
    }

    class Entry{
        int id = 0;
        long val ;

        @Override
        public String toString() {
            return "Entry{" +
                    "id=" + id +
                    ", val=" + val +
                    '}';
        }
    }

    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        List<Integer> res = new ArrayList<Integer>();
        List<Entry> list = new ArrayList<>();
        Set<String> positive = new HashSet<>();
        Set<String> negative = new HashSet<>();
        int n1 = positive_feedback.length;
        int n2 = negative_feedback.length;
        int n3 = student_id.length;
        for (String s : positive_feedback) {
            positive.add(s);
        }
        for (String s : negative_feedback) {
            negative.add(s);
        }

        for (int i = 0; i < n3; i++) {
            int id = student_id[i];
            String rep = report[i];
            long jifen = 0l;
            for (String s : rep.split(" ")) {
                if (positive.contains(s)){
                    jifen +=3;
                }
                if (negative.contains(s)){
                    jifen -=1;
                }
            }
            Entry entry = new Entry();
            entry.id = id;
            entry.val = jifen;
            list.add(entry);
        }
        list.sort((a,b)->{
            if (a.val == b.val){
                return a.id < b.id ? -1: 1;
            }

            return a.val > b.val ? -1 : 1;
        });

        //System.out.println(list);

        for (int i = 0; i < k; i++) {
            res.add(list.get(i).id);
        }
        return res;
    }
}
