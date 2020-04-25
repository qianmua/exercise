package pres.hjc.lanqiao._3;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/4/25
 * @time 14:22
 */
public class Main {

    public static void main(String[] args) {
        int num=0;

        boolean b;

        for(int i=2;i<=19000;i++){
            if(i % 2 == 0 && i != 2  ) {
                continue;
            }
            b=true;

            for (int j=2;j<i;j++){
                if(i%j==0 ){
                    b=false;
                    break;
                }
            }
            if (b && f(19000,i) == 1){

                num++;
            }
        }
        System.out.println(num);
    }

    public static int f(int m,int n){
        if(n==0){
            return m;
        }else{
            return f(n,m%n);
        }
    }
}
