import java.util.HashMap;

public class MyLinkedList<T> implements IMyLinkedList<T>{

    private ListItem<T> head;
    private int totalItems;
    public MyLinkedList() {
        this.head = null;
        this.totalItems = 0;
    }

    private void displayHelper(ListItem<T> obj){
          if(obj == null){
              return;
          }else{
              System.out.print(obj.getValue() + "\t");
              displayHelper(obj.getNext());
          }
    }
    @Override
    public void display() {
          System.out.println();
          displayHelper(this.head);
    }

    @Override
    public void insertAt(int index, T value) throws Exception {
         if(index<0){
             throw new Exception("Cant insert at index less than 0");
         }

         if(index > this.size()){
              throw new Exception("Cant insert at index greater than size");
         }

         if(index == 0){
             this.head = new ListItem<T>(value,this.head) ;
         }else{
             // insert at a location should update "nextValue" of its previous point
             // insert at 2, should update element at 1
             ListItem<T> prevItem = this.getItemAt(index - 1);
             ListItem<T> currentItem = prevItem.getNext();
             ListItem<T> newItem = new ListItem<T>(value,currentItem);
             prevItem.setNext(newItem);

         }
         this.totalItems++;

    }

    @Override
    public void push(T value) throws Exception {
        this.insertAt(this.size(),value);
    }

    private ListItem<T> getItemAt(int i) {
          int counter = 0;
            ListItem<T> temp = this.head;
          while (temp!=null){
                  if(counter == i){
                      return temp;
                  }
                  else{
                      temp = temp.getNext();
                      counter++;
                  }
          }
          return null;
    }

    @Override
    public int size() {
        return this.totalItems;
    }

    @Override
    public T getValueAt(int index) throws Exception {
        ListItem<T> item = this.getItemAt(index);
        if(item == null){
            throw new Exception("Item doesn't exists at index: "+ index);
        }
        return item.getValue();
    }

    @Override
    public void removeAt(int index) throws Exception {
            //[6,7,10]
            if(index<0){
                throw new Exception("Cant remove from index less than 0");
            }

            if(index >= this.size()){
                throw new Exception("Cant remove from index greater than size - 1");
            }

            if(index == 0){
                this.head = this.head.getNext();
            }else{
                // prev.next = current.next
                ListItem<T> prev = this.getItemAt(index - 1);
                assert  prev != null;
                ListItem<T> current = prev.getNext();
                prev.setNext(current.getNext());
            }
            this.totalItems--;
    }

    @Override
    public void updateAt(int index, T value) throws Exception {
           ListItem<T> item = this.getItemAt(index);
           if(item == null){
               throw new Exception("Item doesn't exists at index: " + index);
           }
           item.setValue(value);
    }

    @Override
    public void swap(int index1, int index2) {
        ListItem<T> first = this.getItemAt(index1);
        ListItem<T> second = this.getItemAt(index2);
        assert first != null;
        T val1 = first.getValue();
        assert second != null;
        T val2 = second.getValue();
        first.setValue(val2);
        second.setValue(val1);
    }

    @Override
    public void removeDuplicatesInSortedList() {
        ListItem<T> temp = this.head;
        while (temp.getNext() != null){
            ListItem<T> current = temp;  // 30
            ListItem<T> next = current.getNext(); // 30
            ListItem<T> nextOfNext = next.getNext();  // 30
            if(current.getValue().equals(next.getValue()))
            {
                current.setNext(nextOfNext);
                this.totalItems--;
            }else{
                temp = temp.getNext();
            }

        }
    }

    @Override
    public void removeDuplicates() {
        HashMap<T,T> map = new HashMap<>();
        ListItem<T> temp = this.head;
        ListItem<T> prev = null;
        while (temp != null){
            ListItem<T> current = temp; //50
            if(map.containsKey(current.getValue())){
                // 23 -> 30
                    prev.setNext(current.getNext());
                    this.totalItems--;
                //
            }else{
                map.put(current.getValue(),current.getValue());
                prev = temp;
            }
            temp = temp.getNext();
        }
    }

    @Override
    public void reverse() {
        // go through all the items and set next of each value to prev of them
        ListItem<T> current = this.head;
        ListItem<T> prev = null;
        while (current != null){
            ListItem next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }

        this.head = prev;
    }

    @Override
    public void lastToTheFront() {
            if(this.size() > 1){
                ListItem<T> secondLastItem = this.getItemAt(this.size()-2);
                ListItem<T> tail = secondLastItem.getNext();

                tail.setNext(this.head);
                this.head = tail;
                secondLastItem.setNext(null);
            }
    }
}
