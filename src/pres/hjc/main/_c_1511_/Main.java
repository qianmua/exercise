package pres.hjc.main._c_1511_;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/19
 * @time 22:41
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int a1 = 0 ,b1 = 0;
        for (int i = 0; i < a; i++) {
            a1 += scanner.nextInt();
            b1 += scanner.nextInt();
        }
        System.out.println(a1 + "+"+ b1 + "i");
    }
}
