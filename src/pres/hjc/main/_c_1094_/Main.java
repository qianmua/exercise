package pres.hjc.main._c_1094_;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/19
 * @time 23:13
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a-1;
        while (scanner.hasNext()){
            while (a-- >= 0) {
                String s1 = scanner.nextLine();
                if (b == a){
                    continue;
                }
                System.out.println(s1);
                System.out.println(" ");
            }
            System.out.println(scanner.next());
            System.out.println(" ");
        }
    }
}
