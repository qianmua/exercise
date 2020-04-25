package pres.hjc.lanqiao._9;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/25
 * @time 14:58
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double c = scanner.nextDouble();

        if (c < Math.sqrt(2)){
            System.out.println( a + b);
            return;
        }
        if (a == b){
            double xie = Math.sqrt((double) ((a * a) + (b * b)));
            int t = (int)(c / Math.sqrt(2));
            System.out.println( (int)xie / t);
            return ;
        }else {
            int xie = Math.min(a , b);
            int t = (int)(c / Math.sqrt(2));
            System.out.println( ((xie / t) /*+ (Math.max(a,b) - Math.min(a,b))*/));
            return ;
        }

    }
}
