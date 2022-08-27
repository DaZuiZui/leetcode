public class P1309 {
    public String freqAlphabets(String s) {
        return s.replace("26#","z").replace("25#","y").replace("24#","x").replace("23#","w").replace("22#","v").replace("21#","u").replace("20#","t").replace("19#","s").replace("18#","r").replace("17#","q").replace("16#","p").replace("15#","o").replace("14#","n").replace("13#","m").replace("12#","l").replace("11#","k").replace("10#","j").replace("9","i").replace("8","h").replace("7","g").replace("6","f").replace("5","e").replace("4","d").replace("3","c").replace("2","b").replace("1","a");
    }
}
