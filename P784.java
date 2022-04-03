package leccod;

import java.util.ArrayList;
import java.util.List;

public class P784 {
    public static void main(String[] args) {

    }

    List<String> list = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        char[] arr = s.toCharArray();
        dfs(arr,0);
        return list;
    }

    public void dfs(char[] arr,int index){
        list.add(new String(arr));
        for (int i = index; i < arr.length; i++) {
            if (arr[i] <= '9' && arr[i] >= '0') continue;

            arr[i] = changeLetter(arr[i]);

            dfs(arr,i+1);

            arr[i] = changeLetter(arr[i]);
        }
    }


    public char changeLetter(char c) {
        return (c >= 'a' && c <= 'z') ? (char) (c - 32) : (char) (c + 32);
    }
}
