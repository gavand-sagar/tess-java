public class ListNode<T> {
    private T value;
    private ListNode<T> next;

    public ListNode(T value, ListNode<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public void printAll() throws Exception{
        Thread.sleep(500);
        System.out.println(this.value);
        this.next.printAll();
    }

}
