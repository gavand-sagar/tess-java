public interface IMyDoublyLinkedList {
    void displayForwards();
    void displayBackwards();
    void insertElementAt(int index,String value) throws Exception;
    void removeElementFrom(int index) throws Exception;
    void updateElementAt(int index,String value) throws Exception;
    String getElementAt(int index);
    int size();
}
