package pres.hjc.main._c_1585_;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/19
 * @time 22:52
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[10][2];
        int a = 0,b = 0;
        for (int i = 0; i < 10; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
            a += arr[i][0];
            b += arr[i][1];
        }
        System.out.println(a+"+"+b+"i");
    }
}
