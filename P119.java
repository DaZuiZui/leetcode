package leccod;

import java.util.ArrayList;
import java.util.List;

public class P119 {
    public static void main(String[] args) {
        System.out.println(new P119().getRow(0));
    }
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> listtemp = new ArrayList<>();

    public List<Integer> getRow(int numRows) {

        int[][] arr = new int[numRows+1][numRows+1];
        if (numRows == 1){
            listtemp.add(0);
            list.add(new ArrayList<>(listtemp));
            return list.get(1);
        }else if(numRows == 2){
            listtemp.add(1);
            list.add(new ArrayList<>(listtemp));
            listtemp.clear();
            listtemp.add(1);
            listtemp.add(1);
            list.add(new ArrayList<>(listtemp));
            return list.get(1);
        }else if (numRows == 0){
            listtemp.add(1);
            list.add(new ArrayList<>(listtemp));
            return listtemp;
        }

        listtemp.add(1);
        list.add(new ArrayList<>(listtemp));
        listtemp.clear();
        arr[0][0] =  1;
        arr[1][0] =  1;
        arr[1][1] =  1;
        listtemp.add(1);
        listtemp.add(1);
        list.add(new ArrayList<>(listtemp));
        listtemp.clear();

        for (int i = 2; i < arr.length; i++) {
            for (int j = 0; j < i+1; j++) {
                if (j ==0){
                    arr[i][j] = 1;
                    listtemp.add(arr[i][j]);
                }
                if (j != i && j != 0){
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    listtemp.add(arr[i][j]);
                }
                if ( j == i){
                    arr[i][j] = 1;
                    listtemp.add(arr[i][j]);
                }
            }
            list.add(new ArrayList<>(listtemp));
            listtemp.clear();
        }

        return list.get(numRows);
    }
}
