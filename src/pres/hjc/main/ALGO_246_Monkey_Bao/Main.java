package pres.hjc.main.ALGO_246_Monkey_Bao;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/1
 * @time 23:30
 */
public class Main {
    private static String pointAndWidth(){
        Scanner scanner = new Scanner(System.in);
        final int mAX_LENGTH = 7;
        double[] arr = new double[mAX_LENGTH];
        for (int i = 0; i < mAX_LENGTH; i++) {
            arr[i] = scanner.nextInt();
        }
        double temp = 0;
        //noinspection AlibabaUndefineMagicConstant
        for (int i = 0; i < (mAX_LENGTH -1 ) / 2 ; i++) {
            temp += arr[i + 3] / arr[i] ;
        }
        String pattern = "##0.";
        for (int i = 0; i < arr[6]; i++) {
            pattern += "0";
        }
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return decimalFormat.format(temp);
    }
    public static void main(String[] args) {
        String temp = pointAndWidth();
        System.out.println(temp);
    }
}
