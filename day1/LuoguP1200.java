package day1;

import java.util.Scanner;

public class LuoguP1200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String plant = scanner.next();
        String team  = scanner.next();
        long plantsum = 1;
        long teamsum = 1;
        for (char c : plant.toCharArray()) {
            plantsum *= (int)(c - 'A'+1);
        }

        for (char c : team.toCharArray()) {
            teamsum *= (int)(c - 'A' +1);
        }
        //System.out.println(plantsum % 47);
        //System.out.println(teamsum % 47);
        String res = plantsum % 47 == teamsum % 47 ? "GO" : "STAY";
        System.out.println(res);
    }
}
