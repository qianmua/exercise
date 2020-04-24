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

    }
}


class LoopQueue{
    private int front;
    private int rear;
    private int maxSize;
    private int queue[];

    public LoopQueue(int maxSize){
        front = 0;
        rear = 0;
        this.maxSize = maxSize;
        queue = new int[this.maxSize];
    }

    public boolean isEmpty(){
        return front == rear ;
    }

    public boolean isFull(){
        return ((rear + 1) % maxSize) == front;
    }

    public void getFront(int front) {
        if (!isEmpty()){
            front = queue[(this.front + 1) % maxSize];
        }else {
            System.out.println("Empty");
            return;
        }
    }

    public void setFront(int front) {
        if (!isFull()){
            rear = (rear + 1 ) % maxSize;
            this.queue[rear] = front;
        }else {
            System.out.println("Full");
            return;
        }
    }

    public void movQueue(){
        if (!isEmpty()){
            front = (front + 1) % maxSize;
        }
    }
}
