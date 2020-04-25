package pres.hjc.main._全排列_;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/25
 * @time 13:29
 */
public class Demo2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        trans(arr,0,arr.length-1);

    }

    static void trans(int arr[] , int a , int b){
        if (a >= b){
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = a; i <= b ; i++) {
            swap(arr, i ,  a);
            trans(arr , a + 1 , b);
            swap(arr , i , a);
        }
    }

    static void swap(int arr[] , int a , int b){
        int temp = arr[a];

        arr[a] = arr[b];
        arr[b] = temp;
    }
}
