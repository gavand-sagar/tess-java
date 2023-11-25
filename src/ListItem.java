public class ListItem<T> {
    private T value;
    private ListItem<T> next;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ListItem<T> getNext() {
        return next;
    }

    public void setNext(ListItem<T> next) {
        this.next = next;
    }

    public ListItem(T value, ListItem<T> next) {
        this.value = value;
        this.next = next;
    }

    public ListItem(T value) {
        this.value = value;
        this.next = null;
    }
}
