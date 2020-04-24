package pres.hjc.main._快速排序_;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/24
 * @time 20:03
 */
public class Myself3 {

    public static void main(String[] args) {
        int arr[] = {345,345,546,567,68,67,4,3,56,4356,54,67587,6,87,213,34,535,345,132455,123,34,5};
        sort(arr,0 , arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void sort(int arr[] ,int s, int e){

        if(s > e){
            return;
        }

        int base = arr[s];

        int a = s, b = e;
        while(a != b){

            while(arr[b] >= base && a<b){
                b--;
            }

            while( arr[a] <= base && a < b){

                a ++ ;
            }

            if(a < b){
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
            }
        }

        arr[s] = arr[a];
        arr[a] = base;

        sort(arr,s, a - 1);

        sort(arr , a + 1, e);

    }
}
