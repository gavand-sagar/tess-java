public class MyPriorityQueue implements IPriorityQueue {
    private  IMyDoublyLinkedList list = new MyDoublyLinkedList();
    @Override
    public void enqueue(int value, int priority) throws Exception {
        int index = list.getIndexfromPriority(priority);
        list.insertElementAt(index,value,priority);
    }

    @Override
    public int dequeue() throws Exception {
        if(list.size() == 0){
            throw new Exception("under flow");
        }
        int value = list.getElementAt(0);
        list.removeElementFrom(0);
        return value;
    }

    @Override
    public int size() {
        return list.size();
    }
}
