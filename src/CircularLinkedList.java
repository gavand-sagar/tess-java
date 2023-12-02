public class CircularLinkedList<T> implements ICircularLinkedList<T> {
    private ListNode<T> head;
    private int size;
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void displayAll() throws Exception {
        this.head.printAll();
    }

    @Override
    public void displayOnce() {
        if(head == null){
            return;
        }
        ListNode<T> temp = this.head;
        do{
            System.out.print(temp.getValue() + "\t");
            temp = temp.getNext();
        }while (temp != this.head);
    }
    @Override
    public void insertAt(int index, T value) throws Exception {
        if(index < 0){
            throw new Exception("Cannot insert at location less than 0");
        }
        if(index > size()){
            throw new Exception("Cannot insert at location greater than size");
        }

        if(index == 0){
            if(size == 0){
                this.head = new ListNode<T>(value,null);
                this.head.setNext(this.head);
            }else{
                ListNode<T> tail = this.getElementAt(this.size - 1);
                this.head = new ListNode<T>(value,this.head);
                tail.setNext(this.head);
            }
        }else{
            ListNode<T> prev = getElementAt(index-1);
            ListNode<T> current = prev.getNext();
            ListNode<T> newItem = new ListNode<T>(value,current);
            prev.setNext(newItem);
            //inserting at extreme end (push a new Item)
            if(index == size()){
                newItem.setNext(this.head);
            }
        }
        this.size++;

    }

    private  ListNode<T> getElementAt(int index){
        int couter = 0;
        if(head == null){
            return null;
        }
        ListNode<T> temp = this.head;
        do{
            if(couter == index){
                return temp;
            }
            couter++;
            temp = temp.getNext();
        }while (temp != this.head);
        return null;
    }


    @Override
    public void removeFrom(int index) throws Exception {
            if(index < 0){
                throw  new Exception("Cant remove from index less than 0.");
            }
            if(index >= size){
                throw  new Exception("Can remove from index greater than the size.");
            }

            if(index == 0){
                if(size==1){
                    this.head = null;
                }else{
                    ListNode<T> tail = this.getElementAt(this.size-1);
                    this.head = this.head.getNext();
                    tail.setNext(this.head);
                }
            }else{
                ListNode<T> prev = this.getElementAt(index - 1);
                ListNode<T> current = prev.getNext();
                ListNode<T> next = current.getNext();
                prev.setNext(next);
            }

            size--;

    }

    @Override
    public void updateAt(int index,T value) {
        ListNode<T> item = getElementAt(index);
        if(item != null){
            item.setValue(value);
        }
    }

    @Override
    public T getValueAt(int index) {
        return this.getElementAt(index).getValue();
    }
}
