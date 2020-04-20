package pres.hjc.main._lc_6_;

import java.math.BigInteger;


/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/20
 * @time 20:33
 */
public class Main {
    /**
     * while(x != 0) {
     *             n = n*10 + x%10;
     *             x = x/10;
     *         }
     *
     *         return n == n? n : 0;
     * @param args
     */
    public static void main(String[] args) {
        int x = -2147483648;
        boolean b = false;
        if (x < 0){
            b = true;
            try {
                x = Integer.parseInt(new BigInteger(String.valueOf(x)).abs().toString());
            } catch (NumberFormatException e) {
                //return 0;
            }
        }
        StringBuffer sb = new StringBuffer(x +"").reverse();
        if (b){
            try {
                System.out.println(Integer.parseInt(sb.toString()) * -1);
                //return Integer.parseInt(sb.toString()) * -1;
            } catch (NumberFormatException e) {
                //return 0;
                System.out.println(0);
            }
        }else {
            try {
                System.out.println(Integer.parseInt(sb.toString()));
                //return Integer.parseInt(sb.toString());
            } catch (NumberFormatException e) {
               //return 0;
                System.out.println(0);
            }

        }
    }
}
