package pres.hjc.main._背包问题_;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/25
 * @time 13:44
 */
public class Demo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int v = scanner.nextInt();
        int arr[] = new int[v + 1];
        int arr2[] = new int[n + 1];
        int arr3[] = new int[n + 1];
        long max = 0;

        for (int i = 1; i < n + 1; i++) {
            arr2[i] = scanner.nextInt();
            arr3[i] = scanner.nextInt();
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = v; j > 0 ; j--) {
                if ( j -arr2[i] > 0){
                    arr[j] = Math.max(arr[j] , arr[j - arr2[i]] + arr3[i]);
                }else {
                    arr[j] = arr[i];
                }
            }
        }
        for (int i = 0; i < v + 1; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        System.out.println(max);
    }
}
