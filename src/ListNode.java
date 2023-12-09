public class ListNode {
    private ListNode prev;
    private int value;

    public ListNode(int value,ListNode prev) {
        this.prev = prev;
        this.value = value;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
