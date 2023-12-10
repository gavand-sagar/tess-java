public interface IMyDoublyLinkedList {
    void insertElementAt(int index,int value,int priority) throws Exception;
    void removeElementFrom(int index) throws Exception;
    int getElementAt(int index);
    int size();
    int getIndexfromPriority(int priority);
}
