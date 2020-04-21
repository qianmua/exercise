package pres.hjc.main._c_2114_;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/21
 * @time 23:21
 */
public class Main {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        long sum = 0;
        for (long i = n; i > 0; i--) {
             sum += f(i);
        }
        System.out.println(sum);
    }

    private static long f(long n){
        if (n == 1){
            return 1;
        }
        return n * f(--n);
    }

}
