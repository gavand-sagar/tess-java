public interface IStack {
    void push(int item) throws Exception;
    int pop() throws Exception;
    int peek();
    int size();
    boolean isEmpty();
    boolean isFull();
}
