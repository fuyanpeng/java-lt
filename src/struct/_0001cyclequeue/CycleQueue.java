package struct._0001cyclequeue;

public class CycleQueue {
    private String [] items;
    private int head;
    private int tail;
    private int n;

    public CycleQueue(Integer n) {
        this.items = new String[n];
        this.head = 0;
        this.tail = 0;
        this.n =n;
    }

    // 入队列
    public Boolean enqueue(String item) {
        if((tail + 1) % n == head){  //队列满
            return false;
        }
        this.items[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }
    // 出队列
    public Boolean dequeue() {
        if (head==tail) {
            return false;
        }
        System.out.printf(items[head].toString());
        head = (head + 1 ) % n;
        return true;
    }
}
