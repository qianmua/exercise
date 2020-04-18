package pres.hjc.main._全排列_;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/16
 * @time 17:59
 */
public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        trans(arr,0,arr.length-1);
    }

    private static void trans(int arr[], int start, int end){
        if (start >= end){
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return ;
        }
        for (int i = start; i <=end; i++) {
            swap(arr,i,start);
            trans(arr, start + 1, end);
            swap(arr,i,start);


        }
    }

    private static void swap(int arr[], int index , int end){
        int temp = 0;
        temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;
    }
}
