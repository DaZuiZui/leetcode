public class P2409 {
    public static void main(String[] args) {
        //System.out.println("07-16".compareTo("07-19"));
        System.out.println(new P2409().countDaysTogether("08-15", "10-18", "10-18", "11-15"));
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int l1 = 0, r1 = 0, l2 = 0, r2 = 0;
        for (int i = 1; i < Integer.parseInt(arriveAlice.substring(0, 2)); i++) l1 += d[i];
        l1 += Integer.parseInt(arriveAlice.substring(3));
        for (int i = 1; i < Integer.parseInt(leaveAlice.substring(0, 2)); i++) r1 += d[i];
        r1 += Integer.parseInt(leaveAlice.substring(3));
        for (int i = 1; i < Integer.parseInt(arriveBob.substring(0, 2)); i++) l2 += d[i];
        l2 += Integer.parseInt(arriveBob.substring(3));
        for (int i = 1; i < Integer.parseInt(leaveBob.substring(0, 2)); i++) r2 += d[i];
        r2 += Integer.parseInt(leaveBob.substring(3));
        if (l1 > r2 || l2 > r1) return 0;
        return Math.min(r2, r1) - Math.max(l1, l2) + 1;
    }
}
