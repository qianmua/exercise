package pres.hjc.main._c_1219_;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/20
 * @time 18:00
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int f = scanner.nextInt();
            int arr[] = new int[9];
            int index= 0,end = 8;
            for (int i1 = 1; i1 < arr.length; i1++) {
                int temp = scanner.nextInt();
                if (f < temp){
                    arr[index++] = temp;
                }else {
                    arr[end--] = temp;
                }
            }
            arr[end] = f;

            for (int i1 = 0; i1 < arr.length; i1++) {
                if (f > arr[i1]){
                    System.out.print(arr[i1] + " ");
                }
            }
            System.out.print(f + " ");
            for (int i1 = 0; i1 < arr.length; i1++) {
                if (f < arr[i1]){
                    System.out.print(arr[i1] + " ");
                }
            }
        }
    }
}
