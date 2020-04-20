package pres.hjc.main._链表_;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/20
 * @time 15:47
 */
public class JavaLinkDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.addFirst("10");
        list.addLast("10");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.remove(1);
        list.subList(3,4).clear();
        System.out.println(list);
    }
}
