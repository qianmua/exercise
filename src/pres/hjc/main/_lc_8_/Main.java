package pres.hjc.main._lc_8_;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/20
 * @time 21:18
 */
public class Main {
    public static void main(String[] args) {
        String str = "  asdasd   -1    22343";
        str = str.replace(" ", "");
        str = str.replaceAll("[a-zA-Z]+", "");
        System.out.println(str);
        long v = Long.parseLong(str);
        int max = 0x7fffffff;
        int min = 0x80000000;
        int a =(int) (v > max ? max: v< min ? min : v);
        System.out.println(str);

    }
}
