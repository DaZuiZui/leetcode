public class P7340 {
    public static void main(String[] args) {
        System.out.println(new P7340().closetTarget(
                new String[]{"pgmiltbptl","jnkxwutznb","bmeirwjars","ugzyaufzzp","pgmiltbptl","sfhtxkmzwn","pgmiltbptl","pgmiltbptl","onvmgvjhxa","jyzdtwbwqp"},
                "pgmiltbptl",
                4
        ));
    }

    public int closetTarget(String[] words, String target, int startIndex) {
        int res =Integer.MAX_VALUE;
        int n = words.length;
        int ltep =0,rtep =0;
        boolean bj = false;
        if (words[startIndex].equals(target)){
            return 0;
        }

        for (int i = startIndex -1 ; ((i+n) % n) != startIndex ; i--) {
            ltep++;
            if (words[(i+n)%n].equals(target)){
                //System.out.println(ltep);
                res = Math.min(ltep ,res);
                bj = true;
                break;
            }
        }

        for (int i = startIndex + 1; ((i+n) % n) != startIndex ; i++) {
            rtep++;
            if (words[(i+n)%n].equals(target)){
                res = Math.min(rtep,res);
                bj = true;
                break;
            }
        }

        return bj == false? -1 : res;
    }
}
