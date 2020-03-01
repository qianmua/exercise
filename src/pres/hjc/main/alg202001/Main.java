package pres.hjc.main.alg202001;

import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2020/3/1
 * Time: 13:19
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    /*
        标题：外星日历

        某星系深处发现了文明遗迹。

        他们的计数也是用十进制。
        他们的文明也有日历。日历只有天数，没有年、月的概念。
        有趣的是，他们也使用了类似“星期”的概念，
        只不过他们的一个星期包含了9天，
        为了方便，这里分别记为: A,B,C....H,I

        从一些资料上看到，
        他们的23日是星期E
        他们的190日是星期A
        他们的343251日是星期I

        令人兴奋的是，他们居然也预见了“世界末日”的那天，
        当然是一个很大很大的数字
        651764141421415346185

        请你计算一下，这遥远的一天是该文明的星期几？

        你需要提交的是一个大写字母，表示该文明的星期几，
        不要填写任何多余的内容。
    */
    private static void waiXingRiLi(){
        String day = "651764141421415346185";
        BigInteger bigInteger = new BigInteger(day);
        //基本方法
        /**
         * add(); 大整数相加
         * subtract(); 相减
         * multiply(); 相乘
         * divide(); 相除取整
         * remainder(); 取余
         * pow(); a.pow(b)=a^b
         * gcd(); 最大公约数
         * abs(); 绝对值
         * negate(); 取反数
         * mod(); a.mod(b)=a%b=a.remainder(b);
         * max(); min();
         * punlic int comareTo();
         * boolean equals(); 是否相等
         *
         */
        bigInteger = bigInteger.mod(BigInteger.valueOf(9));
        char ch = (char) (bigInteger.intValue()+64);
        System.out.println(ch);
    }

    /*

        煤球数目

        有一堆煤球，堆成三角棱锥形。具体：
        第一层放1个，
        第二层3个（排列成三角形），
        第三层6个（排列成三角形），
        第四层10个（排列成三角形），
        ....
        如果一共有100层，共有多少个煤球？

        请填表示煤球总数目的数字。
        注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。

     */
    private static void mieQiuShuMu(){
        int a = 0,b = 0;
        for (int i = 1; i <= 100 ; i++) {
            a += i;
            b += a;
        }
        System.out.println(b);
    }

    /*

        平方怪圈

        如果把一个正整数的每一位都平方后再求和，得到一个新的正整数。
        对新产生的正整数再做同样的处理。

        如此一来，你会发现，不管开始取的是什么数字，
        最终如果不是落入1，就是落入同一个循环圈。

        请写出这个循环圈中最大的那个数字。

        请填写该最大数字。
        注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
     */
    private static void pintFangGuaiQuan(){
        int i = 0;
        int a = 1;
        while (a++ < 100){
            while (i++ <= 100){
                int temp = 0;
                String s = String.valueOf(a);
                for (int j = 0; j < s.length(); j++) {
                    temp += Integer.parseInt(s.substring(j,j+1));
                }
                if (temp <= 9) break;
                System.out.println(temp);
            }
        }

    }

    public static void main(String[] args) {
        pintFangGuaiQuan();
    }
}
