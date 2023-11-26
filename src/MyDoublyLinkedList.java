public class MyDoublyLinkedList implements IMyDoublyLinkedList{
    private ListNode head;
    private ListNode tail;
    private  int size;
    private static void displayForward(ListNode item){
        if(item == null){
            return;
        }
        System.out.print(item.getValue() + "\t");
        displayForward(item.getNext());
    }

    private static void displayBackwards(ListNode item){
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
    public void insertElementAt(int index, String value) throws Exception {

        if(index < 0){
            throw new Exception("Cant insert at index less than 0");
        }
        if (index > this.size()){
            throw new Exception("Cant insert at index greater than size");
        }

        if(index == 0){
            if(this.size() == 0){
                this.head = this.tail = new ListNode(value,null,null);
            }else{
                ListNode item = new ListNode(value,null,null);
                this.head.setPrev(item);
                item.setNext(this.head);
                this.head = item;
            }
        }else{
            ListNode previousNode = getListNodeAt(index - 1);
            if(previousNode == null){
                throw new Exception("Something went wrong");
            }
            ListNode nextNode = previousNode.getNext();
            ListNode newNode = new ListNode(value,nextNode,previousNode);
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
                ListNode prev = this.getListNodeAt(index-1);
                if(prev == null){
                    throw new Exception("Something went wrong");
                }
                ListNode current = prev.getNext();
                ListNode next = current.getNext();
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
    public void updateElementAt(int index, String value) throws Exception {
        ListNode node = getListNodeAt(index);
        if(node == null){
            throw new Exception("Item doesn't exists");
        }
        node.setValue(value);
    }

    @Override
    public String getElementAt(int index) {
        ListNode node = getListNodeAt(index);
        if(node !=null){
            return node.getValue();
        }
        return null;
    }

    private ListNode getListNodeAt(int index) {
        if(index < this.size()/2){
            ListNode temp = this.head;
            int couter = 0;
            while (temp != null){
                if(couter == index){
                    return  temp;
                }
                temp = temp.getNext();
                couter++;
            }
        }else{
            ListNode temp = this.tail;
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
