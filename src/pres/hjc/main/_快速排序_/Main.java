package pres.hjc.main._快速排序_;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/16
 * @time 18:07
 */
public class Main {

    public static void sort(int[] array, int left, int right) {
        //出栈条件
        if(left > right) {
            return;
        }
        // base中存放基准数
        //中间数 ，， 随便第一位吧
        int base = array[left];
        //分区
        int i = left, j = right;
        while(i != j) {
            // 顺序很重要，先从右边开始往左找，直到找到比base值小的数
            while(array[j] >= base && i < j) {
                j--;
            }
            // 再从左往右边找，直到找到比base值大的数
            while(array[i] <= base && i < j) {
                i++;
            }
            // 上面的循环结束表示找到了位置或者(i>=j)了，交换两个数在数组中的位置
            if(i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }

        // 将基准数放到中间的位置（基准数归位）
        array[left] = array[i];
        array[i] = base;

        // 递归，继续向基准的左右两边执行和上面同样的操作
        // i的索引处为上面已确定好的基准值的位置，无需再处理
        sort(array, left, i - 1);
        sort(array, i + 1, right);
    }


    private static void sort2(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        long l = System.currentTimeMillis();
        sort(arr,0 ,arr.length-1);
//        sort2(arr);
        long e = System.currentTimeMillis();
        System.out.println(e-l);
    }
    private static int arr[] = new int[100000];
    static{
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(9999999);
        }
    }
}


