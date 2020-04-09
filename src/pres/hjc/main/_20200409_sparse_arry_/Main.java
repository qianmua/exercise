package pres.hjc.main._20200409_sparse_arry_;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/9
 * @time 21:14
 */
public class Main {
    public static void main(String[] args) {
        int[][] arr1 = new int[10][10];
        arr1[0][1] = 2;
        arr1[1][5] = 1;
        arr1[2][3] = 2;
        arr1[3][8] = 3;
        //得到有效数个数
        int count = 0;
        for (int[] ints : arr1) {
            for (int anInt : ints) {
                if (anInt != 0 ){
                    count ++;
                }
            }
        }
        int temp = 0;
        //创建稀疏数组
        int[][] arr2 = new int[count][3];
        //存入数组
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if ( arr1[i][j] != 0){
                    // 存入稀疏数组中
                    arr2[temp][0] = i;
                    arr2[temp][1] = j;
                    arr2[temp][2] = arr1[i][j];
                    temp++;
                }
            }
        }
        //稀疏数组
        for (int[] ints : arr2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

}
