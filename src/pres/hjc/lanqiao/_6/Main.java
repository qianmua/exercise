package pres.hjc.lanqiao._6;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/25
 * @time 14:34
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n + 1];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int i1 = i + 1; i1 < n; i1++) {
                int temp = ((i - i1) * -1) + Integer.parseInt(new BigInteger(String.valueOf((arr[i] - arr[i1]))).abs().toString());
                max = max > temp ? max : temp;
            }
        }
        System.out.println(max);
    }
}
