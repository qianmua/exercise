package pres.hjc.main._链表_;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/20
 * @time 20:26
 */
public class LinkNodeDemo {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        listNode.val = 1;
    }


}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
