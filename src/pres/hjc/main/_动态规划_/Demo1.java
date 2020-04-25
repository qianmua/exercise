package pres.hjc.main._动态规划_;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/25
 * @time 12:49
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int arr1[] = new int[n+1];
        int arr2[] = new int[n+1];

        for (int i = 0; i < n; i++) {
            for (int i1 = 1; i1 < n + 1; i1++) {
                arr2[i1] = scanner.nextInt();
            }

            for (int i1 = 1; i1 < n + 1; i1++) {
                arr1[i1] = Math.max(arr1[i1], arr1[i1-1])  + arr2[i1];
            }

        }

        System.out.println(arr1[n]);
    }
}
