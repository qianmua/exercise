package pres.hjc.main._c_1453_;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/18
 * @time 23:07
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        int index = 0 , s = 0;
        boolean b = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)){
                if (b){
                    s += i - index;
                    b = false;
                }else {
                    index = i;
                    b = true;
                }
            }
        }
        System.out.println(s);
    }
}
