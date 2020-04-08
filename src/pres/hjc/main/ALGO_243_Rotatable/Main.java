package pres.hjc.main.ALGO_243_Rotatable;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/2
 * @time 0:43
 */
public class Main {
    /**
     * Bike是个十分喜欢数学的聪明孩子。他发明了“可旋转数”，其灵感来自于142857。
     * 　　正如你所见，142857是一个十分神奇的数，因为所有从它通过旋转得到的数都是它自己乘以1,2,3...,6（从1到数的长度）。旋转一个数就是将它的最后一位数字放到最前面。比如说，通过旋转12345你能够得到这些数：12345,51234,45123,34512,23451。值得一提的是这里允许有前导0。因而4500123和0123450都能够通过旋转0012345得到。你可以看看142857满足条件的原因了。下面的6个方程都在十进制下成立：
     * 　　142857 * 1 = 142857;
     * 　　142857 * 2 = 285714;
     * 　　142857 * 3 = 428571;
     * 　　142857 * 4 = 571428;
     * 　　142857 * 5 = 714285;
     * 　　142857 * 6 = 857142
     * 　　现在，Bike提出了一个问题。他将“可旋转数”推广到了任意进制b。如上所示，142857是十进制下的一个“可旋转数”。另外一个例子是二进制下的0011。下面的4个方程都在二进制下成立：
     * 　　0011 * 1 = 0011;
     * 　　0011 * 10 = 0110;
     * 　　0011 * 11 = 1001;
     * 　　0011 * 100 = 1100
     * 　　他想要找到最大的b(1 < b < x)，满足在b进制下存在一个长度为n的正“可旋转数”（允许有前导零）。
     */
    private static void rota(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int i = 1;
        while (i++ < x){
            // i = 2

        }
    }
    public static void main(String[] args) {
        rota();
    }
}
