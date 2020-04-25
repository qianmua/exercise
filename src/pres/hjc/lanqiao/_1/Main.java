package pres.hjc.lanqiao._1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/25
 * @time 13:56
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(f(70044, 19000));
    }

    public static int f(int m,int n){
        if(n==0){
            return m;
        }else{
            return f(n,m%n);
        }
    }
}
