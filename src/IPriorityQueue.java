public interface IPriorityQueue {
    void enqueue(int value,int priority) throws Exception;
    int dequeue() throws Exception;
    int size();

}
