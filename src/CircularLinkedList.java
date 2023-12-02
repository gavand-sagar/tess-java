public class CircularLinkedList implements ICircularLinkedList {
    private ListNode head;
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
        ListNode temp = this.head;
        do{
            System.out.print(temp.getValue() + "\t");
            temp = temp.getNext();
        }while (temp != this.head);
    }
    @Override
    public void insertAt(int index, int value) throws Exception {
        if(index < 0){
            throw new Exception("Cannot insert at location less than 0");
        }
        if(index > size()){
            throw new Exception("Cannot insert at location greater than size");
        }

        if(index == 0){
            if(size == 0){
                this.head = new ListNode(value,null);
                this.head.setNext(this.head);
            }else{
                ListNode tail = this.getElementAt(this.size - 1);
                this.head = new ListNode(value,this.head);
                tail.setNext(this.head);
            }
        }else{
            ListNode prev = getElementAt(index-1);
            ListNode current = prev.getNext();
            ListNode newItem = new ListNode(value,current);
            prev.setNext(newItem);
            //inserting at extreme end (push a new Item)
            if(index == size()){
                newItem.setNext(this.head);
            }
        }
        this.size++;

    }

    ListNode getElementAt(int index){
        int couter = 0;
        if(head == null){
            return null;
        }
        ListNode temp = this.head;
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
                    ListNode tail = this.getElementAt(this.size-1);
                    this.head = this.head.getNext();
                    tail.setNext(this.head);
                }
            }else{
                ListNode prev = this.getElementAt(index - 1);
                ListNode current = prev.getNext();
                ListNode next = current.getNext();
                prev.setNext(next);
            }

            size--;

    }

    @Override
    public void updateAt(int index,int value) {
        ListNode item = getElementAt(index);
        if(item != null){
            item.setValue(value);
        }
    }

    @Override
    public int getValueAt(int index) {
        return this.getElementAt(index).getValue();
    }
}
