public class P1410 {
    public static void main(String[] args) {

    }


    public String entityParser(String text) {

        return text.replace("&quot;","\"").replace("&apos;","\'").replace("&gt;",">")
                .replace("&lp;","<").replace("&frasl;","/") .replace("&amp;","&");
    }
}
