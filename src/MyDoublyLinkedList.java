public class MyDoublyLinkedList<AnyType> implements IMyDoublyLinkedList<AnyType>{
    private ListNode<AnyType> head;
    private ListNode<AnyType> tail;
    private  int size;
    private void displayForward(ListNode<AnyType> item){
        if(item == null){
            return;
        }
        System.out.print(item.getValue() + "\t");
        displayForward(item.getNext());
    }

    private void displayBackwards(ListNode<AnyType> item){
        if(item == null){
            return;
        }
        System.out.print(item.getValue() + "\t");
        displayBackwards(item.getPrev());
    }

    @Override
    public void displayForwards() {
        displayForward(this.head);
    }

    @Override
    public void displayBackwards() {
        displayBackwards(this.tail);
    }

    @Override
    public void insertElementAt(int index, AnyType value) throws Exception {

        if(index < 0){
            throw new Exception("Cant insert at index less than 0");
        }
        if (index > this.size()){
            throw new Exception("Cant insert at index greater than size");
        }

        if(index == 0){
            if(this.size() == 0){
                this.head = this.tail = new ListNode<AnyType>(value,null,null);
            }else{
                ListNode<AnyType> item = new ListNode<AnyType>(value,null,null);
                this.head.setPrev(item);
                item.setNext(this.head);
                this.head = item;
            }
        }else{
            ListNode<AnyType> previousNode = getListNodeAt(index - 1);
            if(previousNode == null){
                throw new Exception("Something went wrong");
            }
            ListNode<AnyType> nextNode = previousNode.getNext();
            ListNode<AnyType> newNode = new ListNode<AnyType>(value,nextNode,previousNode);
            if(nextNode != null){
                nextNode.setPrev(newNode);
            }
            previousNode.setNext(newNode);

            if(index == this.size()){
                this.tail = newNode;
            }
        }

        size++;
    }

    @Override
    public void removeElementFrom(int index) throws Exception {
            if(index < 0){
                throw new Exception("Cant remove element from index less than 0");
            }
            if(index >= this.size()){
                throw new Exception("Cant remove element from index greater than size");
            }

            if(index == 0){
                if(this.size() == 1){
                    this.head = null;
                    this.tail = null;
                }else{
                    this.head = this.head.getNext();
                }
            }else{
                ListNode<AnyType> prev = this.getListNodeAt(index-1);
                if(prev == null){
                    throw new Exception("Something went wrong");
                }
                ListNode<AnyType> current = prev.getNext();
                ListNode<AnyType> next = current.getNext();
                prev.setNext(next);
                if(next != null){
                    next.setPrev(prev);
                }
                if(index == this.size() - 1){
                    this.tail = prev;
                }

            }
            this.size--;

    }

    @Override
    public void updateElementAt(int index, AnyType value) throws Exception {
        ListNode<AnyType> node = getListNodeAt(index);
        if(node == null){
            throw new Exception("Item doesn't exists");
        }
        node.setValue(value);
    }

    @Override
    public AnyType getElementAt(int index) {
        ListNode<AnyType> node = getListNodeAt(index);
        if(node !=null){
            return node.getValue();
        }
        return null;
    }

    private ListNode<AnyType> getListNodeAt(int index) {
        if(index < this.size()/2){
            ListNode<AnyType> temp = this.head;
            int couter = 0;
            while (temp != null){
                if(couter == index){
                    return  temp;
                }
                temp = temp.getNext();
                couter++;
            }
        }else{
            ListNode<AnyType> temp = this.tail;
            int couter = this.size-1;
            while (temp != null){
                if(couter == index){
                    return temp;
                }
                temp = temp.getPrev();
                couter--;
            }
        }

        return null;
    }

    @Override
    public int size() {
        return this.size;
    }
}
