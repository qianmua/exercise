package pres.hjc.lanqiao._10;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/25
 * @time 15:32
 */
public class Main {
    /**/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long arr[]= new long[a * b];
        long num = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLong();
        }
        int h = scanner.nextInt();

        for (int i = 1; i <= h; i++) {
            num = 0;
            for (int i1 = 0; i1 < arr.length; i1++) {
                if (  arr[i1] != 0){
                    num += arr[i1] >= i ? i : arr[i1] ;
                }
            }
            System.out.println(num);
        }

    }
}
