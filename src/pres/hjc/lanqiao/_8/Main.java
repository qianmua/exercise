package pres.hjc.lanqiao._8;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/25
 * @time 14:16
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int a = 0 , b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u'){
                a++;

            }else {
                b++;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
