package pres.hjc.main._循环队列_;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/24
 * @time 21:46
 */
public class Main {

    public static void main(String[] args) {
        LoopQueue queue = new LoopQueue(20);

        queue.setFront(1);
        queue.setFront(2);
        queue.setFront(3);
        queue.setFront(4);
        queue.setFront(5);
        queue.setFront(6);

        System.out.println(queue.getFront());
        System.out.println(queue.getFront());
        System.out.println(queue.getFront());
        System.out.println(queue.getFront());
    }
}


class LoopQueue{
    private int front;
    private int rear;
    private int maxSize;
    private int queue[];

    /**
     * init
     * @param maxSize
     */
    LoopQueue(int maxSize){
        front = 0;
        rear = 0;
        this.maxSize = maxSize;
        queue = new int[this.maxSize];
    }

    /**
     * is empty
     * @return
     */
    private boolean isEmpty(){
        return front == rear ;
    }

    /**
     * full
     * @return
     */
    public boolean isFull(){
        return ((rear + 1) % maxSize) == front;
    }

    /**
     * 队头
     */
    public int getFront() {
        if (!isEmpty()){
//            int temp = front;
            front = (this.front + 1) % maxSize;
            return queue[front];
        }else {
            System.out.println("Empty");
            return -1;
        }
    }

    /**
     * 压队
     * @param rear
     */
    public void setFront(int rear) {
        if (!isFull()){
            this.rear = (this.rear + 1 ) % maxSize;
            this.queue[this.rear] = rear;
        }else {
            System.out.println("Full");
            return;
        }
    }

    /**
     * 移除
     */
    public int movQueue(){
        if (!isEmpty()){
            int temp = front;
            front = (front + 1) % maxSize;
            return temp;
        }else {
            System.out.println("Empty");
            return -1;
        }
    }

    void loop(){
        for (int i = 0; i < queue.length; i++) {
            System.out.println(queue[i]);
        }
    }
}
