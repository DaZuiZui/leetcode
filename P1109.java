public class P1109 {
    public static void main(String[] args) {

    }

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] answer = new int[n];

        for (int i = 0; i < bookings.length; i++) {
             int from = bookings[i][0];
             int to   = bookings[i][1];
             for (int j = from-1 ; j < to; j++) {
                answer[j] += bookings[i][2];
             }
        }

        return answer;
    }
}
