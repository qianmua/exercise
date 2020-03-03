package pres.hjc.main.alg202001;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

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
        int a = 99;
        TreeSet treeSet = new TreeSet();
        while (i++ <= 10000){
            String s = String.valueOf(a);
            int b = 0;
            for (int j = 0; j < s.length(); j++) {
                b += Math.pow(Integer.parseInt(s.substring(j,j+1)),2);
            }
            treeSet.add(b);
            a = b;
        }
        treeSet.forEach(System.out::println); // 162
    }

    /*

        凑算式

             B      DEF
        A + --- + ------- = 10
             C      GHI

        （如果显示有问题，可以参见【图1.jpg】）


        这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。

        比如：
        6+8/3+952/714 就是一种解法，
        5+3/1+972/486 是另一种解法。

        这个算式一共有多少种解法？

        注意：你提交应该是个整数，不要填写任何多余的内容或说明性文字。

     */
    //全排列，
    static List<int[]> list = new ArrayList<>();
    private static void couSuanShi(){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        arrange(arr,0 , arr.length - 1);
        System.out.println(list.size());
        /*for (int[] ints : list) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }*/
    }

    private static void add(int arr[]){
//        list = new ArrayList<>();
        //0 2 678 + 1 678 + 2 345 = 10 2 678
        //  + arr[1]*arr[6]arr[7]arr[8] + arr[2]*arr[3]arr[4]arr[5] = 10*arr[2]*arr[6]arr[7]arr[8]
        if (arr[0]*arr[2]*Integer.parseInt(arr[6]+""+arr[7]+""+arr[8]) +
                arr[1]*Integer.parseInt(arr[3]+""+arr[4]+""+arr[5]) ==
        10 * arr[2] * Integer.parseInt(arr[6]+""+arr[7]+""+arr[8])){
            list.add(arr);
        }

        /*for (int[] ints : list) {
//            System.out.println(ints);
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }*/
    }

    private static void arrange(int[] arr , int a, int b){
        if ( a == b){
            add(arr);
            return ;
        }
        for (int i = a; i <= b ; i++) {
            swap(arr,i,a);
            arrange(arr,a + 1,b);
            swap(arr,i,a);
        }

    }
    private static void swap(int arr[] , int a, int b){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    /*
     *
     冰雹数

     任意给定一个正整数N，
     如果是偶数，执行： N / 2
     如果是奇数，执行： N * 3 + 1

     生成的新的数字再执行同样的动作，循环往复。

     通过观察发现，这个数字会一会儿上升到很高，
     一会儿又降落下来。
     就这样起起落落的，但最终必会落到“1”
     这有点像小冰雹粒子在冰雹云中翻滚增长的样子。

     比如N=9
     9,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1
     可以看到，N=9的时候，这个“小冰雹”最高冲到了52这个高度。

     输入格式：
     一个正整数N（N<1000000）
     输出格式：
     一个正整数，表示不大于N的数字，经过冰雹数变换过程中，最高冲到了多少。

     例如，输入：
     10
     程序应该输出：
     52

     再例如，输入：
     100
     程序应该输出：
     9232

     资源约定：
     峰值内存消耗（含虚拟机） < 256M
     CPU消耗  < 1000ms


     请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

     所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
     注意：不要使用package语句。不要使用jdk1.7及以上版本的特性。
     注意：主类的名字必须是：Main，否则按无效代码处理。
     */
    private static void BingBaoShu(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
//        TreeSet set = new TreeSet();
        int temp = 1;
        int max = 0;
        while ( temp++ < a){
            int n = addSum(temp,temp);
            if (n > max) max = n;
        }
        System.out.println(max);
    }

    private static int addSum(int a,int max){
        if (a == 1) {
            return max;
        }else if (a % 2 == 0){
                a = a / 2;
                if (a > max) max = a;
                return addSum(a,max);
            }else{
                a = a * 3 + 1;
                if (a > max) max = a;
                return addSum(a,max);
            }

    }

    public static void main(String[] args) {
        BingBaoShu();
    }
}

