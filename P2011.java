package leccod;

public class P2011 {
    public static void main(String[] args) {

    }

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.equals("X++")){
                x++;
            }else if (operation.equals("++X")){
                x++;
            }else if (operation.equals("X--")){
                x--;
            }else if (operation.equals("--X")){
                x--;
            }
        }

        return x;
    }
}
