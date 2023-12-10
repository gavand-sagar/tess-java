public class LinkedListQueue implements IQueue {
    private ListNode head;
    private ListNode tail;
    int size = 0;
    public LinkedListQueue() {
        head = null;
        tail = null;
    }
    @Override
    public void enqueue(int item) throws Exception {
        if(this.tail == null){
            head = tail = new ListNode(item,null);
        }else{
            ListNode newvalue = new ListNode(item,null);
            tail.setNext(newvalue);
            tail = newvalue;
        }
        size++;
    }
    @Override
    public int dequeue() throws Exception {
        if(this.size == 0){
            throw new Exception("Queue underflow");
        }
        int value = this.head.getValue();
        if(this.size == 1){
            head = tail = null;
        }else{
            head = head.getNext();
        }
        size--;
        return value;
    }

    @Override
    public int front() {
        return this.head.getValue();
    }

    @Override
    public int size() {
        return this.size;
    }
}
