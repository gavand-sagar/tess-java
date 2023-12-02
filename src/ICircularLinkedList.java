public interface ICircularLinkedList {
    int size();
    void displayAll() throws Exception ;
    void displayOnce();
    void insertAt(int index,int value) throws Exception;
    void removeFrom(int index) throws Exception;
    void updateAt(int index,int value);
    int getValueAt(int index);
}
