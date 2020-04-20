package pres.hjc.main._向量_;

import java.util.Vector;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/20
 * @time 16:10
 */
public class Main {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("X");
        v.add("M");
        v.add("D");
        v.add("A");
        v.add("O");
        v.add("O");
        v.add(null);
        System.out.println(v);
    }
}
