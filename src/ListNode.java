public class ListNode {
    private  int value;
    private int priority;
    private ListNode next;
    private ListNode prev;

    public ListNode(int value,int priority, ListNode next, ListNode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
        this.priority = priority;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}
