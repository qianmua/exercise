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
        while (scanner.hasNext()){
            while (a-- >= 0) {
                System.out.print(scanner.nextLine() + "\n\t");
                System.out.println(" ");
            }
            System.out.println(scanner.next());
            System.out.println(" ");
        }
    }
}
