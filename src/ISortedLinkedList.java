public interface ISortedLinkedList {
    void display();
    void push(Integer value) throws Exception;
    int size();
    Integer getValueAt(int index) throws Exception;
    void removeAt(int index) throws Exception;
    void removeDuplicates();
}
