package pres.hjc.lanqiao._7;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/25
 * @time 14:47
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++) {
            char[] ch = (i + "").toCharArray();
            for (int i1 = 0; i1 < ch.length; i1++) {
                if (ch[i1] == '2'){
                    c ++;
                    break;
                }
            }
        }
        System.out.println(n - c);
    }
}
