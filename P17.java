package leccod;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P17 {


    public static void main(String[] args) {
        new P17().letterCombinations("23");
    }
    HashMap<String,String> map = new HashMap();
    ArrayList<List<Character>> list = new ArrayList();
    ArrayList<Character> listemp = new ArrayList();

    public List<String> letterCombinations(String digits) {
        ArrayList<String> arrayList = new ArrayList();
        if (digits.length() == 0){
            return arrayList;
        }

        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        getVal(digits,0);



        for (int i = 0; i < list.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            List<Character> l  = list.get(i);
            for (int j = 0; j < l.size(); j++) {
                stringBuilder.append(l.get(j));

            }
            arrayList.add(stringBuilder.toString());
        }

        return arrayList;
    }

    public void  getVal(String  number,int start){
        if (number.length()==listemp.size()){
            list.add(new ArrayList<Character>(listemp));
            return ;
        }

        String zm = map.get(number.charAt(start)+"");


        for (int i = 0; i < zm.length(); i++) {
            listemp.add(zm.charAt(i));
            getVal(number,start+1);
            listemp.remove(listemp.size()-1);
        }
    }
}
