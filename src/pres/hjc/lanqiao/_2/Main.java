package pres.hjc.lanqiao._2;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/25
 * @time 13:56
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n+1];
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[i + 1]){
                count ++;
            }else {
                max = count > max ? count : max;
                count = 0;
            }
        }
        System.out.println(max + 1);
    }
}
