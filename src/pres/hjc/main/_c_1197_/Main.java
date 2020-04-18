package pres.hjc.main._c_1197_;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/18
 * @time 22:42
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1 ,temp = 0;
        while (a !=0){
        a = scanner.nextInt();
        while (true){
            int b = scanner.nextInt();
            if (b != 0){
                temp += gets(b);
            }else {
                System.out.println(temp);
                temp = 0;
                break;
            }
        }
        }

    }
    /**123*/
    private static int gets(int i){
        int a = i / 100;
        i -= 100*a;
        int b = i / 50;
        i -= 50*b;
        int c = i / 10;
        i -= 10*c;
        int d = i / 5;
        i -= 5*d;
        int e = i / 2;
        i -= 2*e;
        return i + a + b + c + d + e;
    }

}
