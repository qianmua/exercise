package pres.hjc.main._c_1044_;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/19
 * @time 22:55
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = new String[3];
        s[0] = scanner.next();
        s[1] = scanner.next();
        s[2] = scanner.next();
        Arrays.sort(s);
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
