package pres.hjc.main._动态规划_;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/16
 * @time 19:06
 */
public class Main {
    /**贪心全靠猜样例，dp全靠找规律，组合数学看运气，计算几何瞎暴力，图论一顿套模板，数论只靠GCD。

其他全部看天意。

绝技是能暴力则暴力，复杂度不允许就特判后台可能存在的极端样例。+
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[n+1];
        int[] readMax = new int[n+1];

        for(int i=0;i<n;i++){
            for(int k=1;k<n+1;k++){
                readMax[k] = scan.nextInt();
            }
            for(int j=1;j<n+1;j++){
                dp[j] = Math.max(dp[j],dp[j-1])+readMax[j];
            }
        }
        System.out.println(dp[n]);
    }
}
