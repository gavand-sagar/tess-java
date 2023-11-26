public class ListNode<AnyType> {
    private  AnyType value;
    private ListNode<AnyType> next;
    private ListNode<AnyType> prev;

    public ListNode(AnyType value, ListNode<AnyType> next, ListNode<AnyType> prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public AnyType getValue() {
        return value;
    }

    public void setValue(AnyType value) {
        this.value = value;
    }

    public ListNode<AnyType> getNext() {
        return next;
    }

    public void setNext(ListNode<AnyType> next) {
        this.next = next;
    }

    public ListNode<AnyType> getPrev() {
        return prev;
    }

    public void setPrev(ListNode<AnyType> prev) {
        this.prev = prev;
    }
}
