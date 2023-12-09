public class StackDynamic implements IStack{

    private ListNode tail = null;
    int size = 0;
    @Override
    public void push(int item) throws Exception {
        tail = new ListNode(item,tail);
        size++;
    }

    @Override
    public int pop() throws Exception {
        if(tail == null){
            throw new Exception("Stack underflow");
        }
        int prevValue = tail.getValue();
        tail = tail.getPrev();
        size--;
        return prevValue;
    }

    @Override
    public int peek() {
        return tail.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return tail == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
