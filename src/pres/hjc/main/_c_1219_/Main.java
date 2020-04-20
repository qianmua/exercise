package pres.hjc.main._c_1219_;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/20
 * @time 16:47
 */
public class Main {
    /**
     * 自闭的写法
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < 2; i++) {
            int arr[] = new int[8];
            int first = scanner.nextInt();
            for (int i1 = 0; i1 < 9-1; i1++) {
                arr[i1] = scanner.nextInt();
            }
            Arrays.sort(arr);
            for (int j = 0; j < arr.length; j++) {
                if (first < arr[j]){
                    int arr1[] = new int[j];
                    int temp = 0;
                    for (int i1 = j-1; i1 >= 0; i1--) {
                        arr1[temp++] = arr[i1];
                    }
                    for (int k = 0; k < arr1.length; k++) {
                        System.out.print(arr1[k] + " ");
                    }
                    System.out.print( first + " ");
                    for (int k = j; k < arr.length; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    break;
                }
            }
        }
    }
}
