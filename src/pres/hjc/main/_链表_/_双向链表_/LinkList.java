package pres.hjc.main._链表_._双向链表_;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/20
 * @time 14:40
 */
public class LinkList {
    private Node head;
    private Node tail;
    private int size = 0;

    /**
     * 初始化链表
     */
    public LinkList(){
        head = new Node();
        tail = new Node();
        head.next = null;
        tail.pre = null;

    }

    /**
     * 是否空链表
      * @return
     */
    public boolean empity(){
        if (head.next == null){
            return true;
        }
        return false;
    }

    /**
     * 找前一个节点
     * @param index
     * @return
     */
    public Node findPre(int index){
        Node n = head;
        int dex = -1;
        while (n.next != null){

            //找到了插入节点的上一个节点
            if (dex == index - 1){
                return n;
            }
            n = n.next;
            dex ++ ;
        }
        return null;
    }

    /**
     * 当前节点
     * @param index
     * @return
     */
    public Node findThis(int index){
        Node n = head;
        //n想象为指针，dex为指向的下标，这个地方很容易错，因为当指向最后一个节点时没有判断IF就跳出循环了
        int dex = -1;
        while (n.next != null){
            if (dex == index){
                return n;
            }
            n = n.next;
            dex ++ ;
        }
        return null;
    }

    /**
     * 添加到链表末尾
     * @param o
     */
    public void push(Object o){
        Node node = new Node(o);
        Node n = head;
        //如果是空链表的话插入一个节点，这个节点的pre不能指向上一个节点，必须指空
        if (this.empity()){
            n.next = node;
            n.next.pre = null;
            tail.pre = node;
            size ++ ;
        }else{
            while (n.next != null){
                n = n.next;
                n.next = node;
                n.pre = n;
                tail.pre = node;
                size ++ ;
            }
        }
    }

    /**
     * 给指定下标添加节点
     * @param index
     * @param e
     * @return
     */
    public boolean push(int index , Object e){
        if (index <0 || index >= size ){
            return false;
        }
        Node node = new Node(e);
        Node pre = this.findPre(index);
        node.next = pre.next;
        pre.next.pre = node;
        pre.next = node;
        node.pre = pre;
        size ++ ;
        return true;
    }

    public Object remove(int index){
        Object e = this.get(index);
        if(index < 0 || index >= size){
            return null;
        }
        //特殊情况，当移除节点是最后一个节点的时候
        if (index == size -1){
            //Node pre = this.findPre(index);
            this.tail.pre = this.tail.pre.pre;
            this.tail.pre.next.pre = null;
            this.tail.pre.next = null;
            size -- ;
            return e;
        }else{
            Node pre = this.findPre(index);
            pre.next = pre.next.next;
            pre.next.pre.next = null;
            pre.next.pre = pre.next.pre.pre;
            size --;

            return e;
        }
    }

    /**
     * 得到某一节点得值
     * @param index
     * @return
     */
    public Object get(int index){
        Node thisNode = this.findThis(index);
        return thisNode.e;
    }
    /**
     * link 大小
     * @return
     */
    public int size(){
        return size;
    }


}
