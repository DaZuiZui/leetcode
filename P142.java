import java.util.*;

public class P142 {
    public static void main(String[] args) {
        List<List<String>> favoriteCompanies = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("leetcode");
        list1.add("google");
        list1.add("facebook");
        favoriteCompanies.add(new ArrayList<>(list1));
        list1.clear();
        list1.add("google");
        list1.add("microsoft");
        favoriteCompanies.add(new ArrayList<>(list1));
        list1.clear();
        list1.add("google");
        list1.add("facebook");
        favoriteCompanies.add(new ArrayList<>(list1));
        list1.clear();
        list1.add("google");
        favoriteCompanies.add(new ArrayList<>(list1));
        list1.clear();
        list1.add("amazon");
        favoriteCompanies.add(new ArrayList<>(list1));

        System.out.println(new P142().peopleIndexes(favoriteCompanies));
    }

    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < favoriteCompanies.size(); i++) {
            Set<String> set1 = new HashSet<>(favoriteCompanies.get(i));
            boolean b = true;
            for (int j = 0; j < favoriteCompanies.size(); j++) {
                if (i == j) continue;
                Set<String> set2 = new HashSet<>(favoriteCompanies.get(j));
                if (set2.containsAll(set1)){
                    b = false;
                    break;
                }
            }

            if (b){
                res.add(i);
            }
        }
        return res;
    }
}
