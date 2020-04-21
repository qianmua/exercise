package pres.hjc.main._c_2114_;

import java.math.BigInteger;
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
        BigInteger sum = new BigInteger("0");
        for (long i = n; i > 0; i--) {
             sum = sum.add(f(i));
        }
        System.out.println(sum);
    }

    private static BigInteger f(long n){
        if (n == 1){
            return new BigInteger("1");
        }
        return new BigInteger(String.valueOf(n)).multiply(f(--n)) ;
    }

}
