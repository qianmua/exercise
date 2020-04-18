package pres.hjc.main._c_2119_;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/18
 * @time 23:32
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Set list = new TreeSet();
        for (int i = 0; i < a; i++) {
            list.add(scanner.nextInt());
        }
        Object[] arr = list.toArray();
        Arrays.sort(arr);
        System.out.println(arr.length);
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }
}
