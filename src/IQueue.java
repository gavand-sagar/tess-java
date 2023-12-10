public interface IQueue {
    void enqueue(int item) throws Exception;
    int dequeue() throws Exception;
    int front();
    int size();
}
