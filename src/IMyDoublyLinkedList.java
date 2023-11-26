public interface IMyDoublyLinkedList<AnyType> {
    void displayForwards();
    void displayBackwards();
    void insertElementAt(int index,AnyType value) throws Exception;
    void removeElementFrom(int index) throws Exception;
    void updateElementAt(int index,AnyType value) throws Exception;
    AnyType getElementAt(int index);
    int size();
}
