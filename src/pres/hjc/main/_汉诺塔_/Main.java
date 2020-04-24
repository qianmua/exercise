package pres.hjc.main._汉诺塔_;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/22
 * @time 20:02
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = 'A', b = 'B' , c = 'C';
        int n = scanner.nextInt();
        // 次数 2^n - 1
        f(n,a,b,c);
        scanner.close();
    }

    private static void print(int number, char f , char l){
        System.out.println("编号" + number + " " + f + " mov ->" + l);
    }

    private static void f(int n , char a, char b, char c){
        if (n == 1){
            print(n , a , c);
        }else {
            f(n - 1 , a , c, b);
            print(n , a , c);
            f(n - 1, b , a , c);
        }

    }
}
