public interface IStack {
    void push(int item);
    int pop();
    int peek();
    int size();
    boolean isEmpty();
    boolean isFull();
}
