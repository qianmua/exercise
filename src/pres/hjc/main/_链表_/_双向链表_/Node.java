package pres.hjc.main._链表_._双向链表_;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/20
 * @time 14:38
 */
public class Node {
    public Object e;
    public Node next;
    public Node pre;
    public Node(){}
    public Node(Object e){
        this.e = e;
        next = null;
        pre = null;
    }
}
