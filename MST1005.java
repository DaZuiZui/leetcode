package leccod;

import lancup.lancup2021.A;

import java.util.ArrayList;
import java.util.Arrays;

public class MST1005 {
    public static void main(String[] args) {
        new MST1005().findString(
                new String[]{"at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""},
                "ta"
        );
    }

    public int findString(String[] words, String s) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(words));

        return arrayList.indexOf(s);
    }
}
