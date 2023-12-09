public class Stack implements IStack {
    private int[] array = new int[10];
    private int lastItemIndex = -1;
    @Override
    public void push(int item) throws Exception {
        if(isFull()){
            throw new Exception("Stack overflow");
        }
        lastItemIndex++;
        array[lastItemIndex] = item;
    }

    @Override
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack underflow");
        }
        int temp = array[lastItemIndex];
        lastItemIndex--;
        return temp;
    }

    @Override
    public int peek() {
        return array[lastItemIndex];
    }

    @Override
    public int size() {
        return (lastItemIndex + 1);
    }

    @Override
    public boolean isEmpty() {
        return lastItemIndex == -1;
    }

    @Override
    public boolean isFull() {
        return (array.length - 1 ) == lastItemIndex;
    }
}
