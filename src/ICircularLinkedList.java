public interface ICircularLinkedList<T> {
    int size();
    void displayAll() throws Exception ;
    void displayOnce();
    void insertAt(int index,T value) throws Exception;
    void removeFrom(int index) throws Exception;
    void updateAt(int index,T value);
    T getValueAt(int index);
}
