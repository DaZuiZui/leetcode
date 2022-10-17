import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;

public class LCP30 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        queue1.add(-2);
        queue1.add(-3);
        queue1.add(-12);
        System.out.println(queue1);
        System.out.println(queue1.poll());

        System.out.println(new LCP30().magicTower(new int[]{-99903, -29807, -65465, -78562, -16777, -55714, 65807, -96813, 54587, 4290, 30653, -49870, 49400, -76411, 56048, 10733, -99416, -28523, -30234, -51457, 85671, 29117, 74713, 67769, 45112, -41938, -65723, -23979, 24752, 95938, -4081, 76425, 31986, 56723, 79500, 11843, 12243, 9198, 85420, 84618, -97897, -1703, -14787, -54629, -68517, 66242, -27365, -99691, -32686, -15726, -53044, -97178, 57754, 26420, 78966, 76579, 19024, -52579, 65332, -69868, -85512, -42463, 78302, 64432, -74022, -47341, 74180, 99723, 27339, -45473, -13957, 39497, 96249, -70519, -66084, 61435, 85820, 70989, 55575, -23151, -58297, -35554, -36316, -79681, -35552, -51542, -74674, 35796, 64600, -30385, -19394, 78770, -6009, 73095, -2150, -6222, -35221, -35454, 21749, 27758, 15916, -9510, 50570, -57564, -33994, 53194, -9879, -39304, 63645, 85271, -95079, -80687, 3323, -13215, -41118, 24484, -94524, 3185, -47528, 88961, 39983, 45344, 96510, -90705, 47234, -62970, -88957, 15723, 7874, -94528, -76551, -47407, -27797, -89987, 63637, 59951, 6519, 789, 92396, 87451, -66690, -69897, 15813, 36511, -43214, -98175, 70570, -78129, 50289, -50402, -21139, -53547, -14102, -60554, 97370, -31598, 25909, -41458, 12646, -52501, -4532, 5369, 96451, 76561, -93515, 7765, 58871, -37414, 69551, -99213, -48963, -30896, 50538, -17217, 15926, 47498, -5499, -46126, 63247, -51914, 29646, 34803, 66291, -701, 75176, -35066, -11964, -55581, 95353, -25434, 74288, -79577, 44653, 14968, 68722, 57549, -9455, 68871, 76165, -61783, 83177, 71509, -91271, 29005, -10752, -83190, -15627, -19707, 93649, 93501, 90555, -45632, -85130, 13624, -20628, -11524, -20598, 2336, 97966, 37197, -41100, 9750, 70048, -5904, -23160, 5325, 88662, -68272, 93021, 44844, 43897, 15207, 10130, -79004, 91947, 8868, -53244, 68378, 99857, 92156, 2795, -6212, -97432, 95403, -17473, 81899, -38896, 6866, -71114, 76674, -71123, -7410, 73133, 9104, -9309, 19206, 34170, -57161, 58489, 80526, -10406, -84489, 25601, -86356, -26185, 76297, 20615, 73676, 96655, 65188, 88842, 3161, 44417, -63705, -11361, 72235, 67505, -47025, 18110, -31838, 40727, -34444, -63077, 50755, 30338, 80663, 55886, -94300, -2249, 49682, 1433, 65142, -52504, -61768, -12990, -55933, -86964, -20508, -48383, 55130, -58982, 85483, -5201, -74372, -19215, 13182, 72462, -84731, 67430, -27035, -60430, 66620, -73976, -90332, -44522, -78829, -11646, -17304, -24864, 3249, 75994, 42022, -56170, 34268, -19334, -67976, 64644, 69896, -73066, -24777, -84051, 74173, 39409, 77757, 84629, 92430, -21423, 10172, -75626, 1534, 8234, -26911, -57842, 45369, 89370, -87969, 45040, 32331, -99570, 41263, -81646, 39006, 61506, -64195, 42483, -7845, -26849, 81331, -4424, -97229, 17526, 81934, 94673, 50729, -89107, -99623, -87939, 11295, 93981, 63370, -46524, 32367, 51294, -20667, -22036, 44732, 16180, -70937, -52065, -38946, -34144, 9290, 32907, 22342, -50554, 5697, 52662, 31401, 18334, 40534, -30924, -89893, -50838, 88645, -37642, -61463, 42867, 58516, -36604, 37246, 57564, 10567, 32565, -60397, -99775, 22181, -76496, -48572, 23871, 17449, 75026, 45778, -30220, 35979, 73665, -71488, 30285, -49736, 29168, 60662, -83260, -45049, -39220, 75588, 17290, 96113, 89305, -41961, -21397, -81644, 31, 22055, -31195, -26809, -4447, 5419, 80595, 77279, -31811, 62483, -42711, -450, 64763, 16437, -44869, -33640, 27930, 69353, -95550, -74697, 44075, -40847, -18479, 54785, -69043, -76518, -36002, 77914, 86241, 83521, -87335, 4634, 12102, -56308, 65924, -61219, 67664, -54447, 19301, -64022, 2456, -51457, 88908, 68436, -38744, 70535, 17649, -35677, 1101, -521, 47256, 21703, 98640, 53860, 33076, 64370, 68492, -619, -2538, -51065, -27133, -32484, 62138, -54651, -70877, -92686, 16494, -56494, 88677, -75684, 88893, 52468, -13996, -33063, -55174, 1201, 74110, 94456, -56613, -8551, 90763, 46935, 56870, 95067, 95493, -10381, 85482, -56359, -48221, 84632, -20775, 43023, 88276, 42157, -14371, 96490, 46265, 68059, 68865, 44523, -40415, 1966, 82094, 15167, 15837, 20773, -76517, 18219, -6552, -72201, -94782, 49420, -1352, 52383, 8260, -93954, -76119, -58561, 42549, -34183, 61599, -2679, -24998, 11341, -60428, 94269, 49663, -56502, 58941, -26466, -42126, -23534, 11333, 61214, -16525, -96209, -49318, 47923, -86472, -57597, -52860, -95716, 26404, 26575, -70041, 97348, -82482, -61905, -10176, 80634, 44233, 10397, 62192, -18610, -69039, -37976, 7454, -59193, -64856, -5322, -89538, 91141, -9223, -16413, 83315, 96052, 42037, 77293, 53439, 68419, 93424, 29774, 17709, -91175, -98274, -57613, -90125, -52666, 68101, 97687, 97688, 1431, -33373, -40054, -50855, 88744, 18884, 87222, -42158, 70241, 823, -69719, 65424, 62758, -36504, -48507, 29189, -3047, -88718, -91266, -54495, 83447, -66417, 44093, 82743, -34709, -19760, -40595, -30598, -81277, 98775, 3215, 59064, 77789, -71713, 84038, -60312, -10304, 52440, -72462, 47649, -91520, -31147, 23256, -95749, -43795, -24458, -94318, 33067, 57302, 31032, -33551, 27675, 96321, 79660, 529, -52494, 44395, -62132, 56687, -88088, -16441, 72338, -45538, 54921, 31835, 24865, -66570, -62672, -79853, 98257, 75310, -50216, 66768, -92244, -87613, -33708, 93993, -53217, 90583, 28533, 59248, -64025, -85767, -8832, -6076, 27022, 38244, 25900, 27173, -19326, 38093, -1899, 71974, 62225, -23312, 83319, 97807, 92300, 88139, -50615, 81182, -61758, 73036, 84571, 95940, -53727, 3220, 67108, -22033, 99771, -16107, 79121, 27388, -29355, 96980, 40929, -50090, 75262, 15106, 75192, 30125, 67178, 46461, 57368, -34524, -79961, -68641, -48965, 53535, 8038, 73727, 2796, 17152, 92445, 89304, -17908, -12584, 41583, 20441, -70361, 19985, 39025, -17857, 17119, 26607, -55428, 39558, -31459, 25747, -70530, 33919, -30631, 95748, -11093, -53951, 49648, 33223, -32613, 19041, -8648, -39537, -57113, 28336, 36800, 50518, 60985, 14460, -17805, 15970, -49871, -98459, -93774, -49529, 32232, -74231, -13820, -24022, -26680, 98123, -24466, -46357, 85551, -67695, -20354, 2343, -89843, -6491, -88810, -63012, -59217, -45979, -25772, -12936, -34300, -34845, 54700, 63130, 29090, 83646}));
    }

    public int magicTower(int[] nums) {
        if (Arrays.stream(nums).sum()+1 <= 0){
            return -1;
        }

        PriorityQueue<Integer> queue1 = new PriorityQueue<>((a,b)->{
            return a-b;
        });

        int res = 0;
        long hp = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0){
                queue1.offer(nums[i]);
                if (hp + nums[i] <= 0){
                    int tmp =queue1.poll();
                    res++;
                    hp -=tmp;
                }
            }

            hp += nums[i];
        }

        return res;
    }
}
