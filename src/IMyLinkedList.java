public interface IMyLinkedList<T> {
    void display();
    void insertAt(int index,T value) throws Exception;
    int size();

    T getValueAt(int index) throws Exception;
    void removeAt(int index) throws Exception;
    void updateAt(int index,T value) throws Exception;
    void swap(int index1,int index2);

}
