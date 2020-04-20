package pres.hjc.main._队列_;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/20
 * @time 16:13
 */
public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        queue.remove(2);
        for (Object o : queue) {
            System.out.println(o);
        }
        /*System.out.println(queue.element());
        System.out.println(queue.peek());*/
    }
}
