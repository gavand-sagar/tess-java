import java.util.HashMap;
public class SortedLinkedList implements ISortedLinkedList{
    private ListItem<Integer> head;
    private int totalItems;
    public SortedLinkedList() {
        this.head = null;
        this.totalItems = 0;
    }

    private void displayHelper(ListItem<Integer> obj){
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
    public void push(Integer value) throws Exception {
        if(size() == 0){
            this.head = new ListItem<Integer>(value);
        }else{
            ListItem<Integer> current = this.head;
            ListItem<Integer> prev = null;
            boolean inserted = false;
            while (current != null){
                if(value <= current.getValue()) {
                   if(prev == null){
                       this.head = new ListItem<>(value);
                   }else{
                       prev.setNext(new ListItem<>(value,current));
                   }
                   inserted = true;
                   break;
               }
               prev=current;
               current = current.getNext();
            }
            if(!inserted){
                //insert at the end
                prev.setNext(new ListItem<>(value,null));
            }
        }

        totalItems++;
    }

    private ListItem<Integer> getItemAt(int i) {
          int counter = 0;
            ListItem<Integer> temp = this.head;
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
    public Integer getValueAt(int index) throws Exception {
        ListItem<Integer> item = this.getItemAt(index);
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
                ListItem<Integer> prev = this.getItemAt(index - 1);
                assert  prev != null;
                ListItem<Integer> current = prev.getNext();
                prev.setNext(current.getNext());
            }
            this.totalItems--;
    }

    @Override
    public void removeDuplicates() {
        HashMap<Integer,Integer> map = new HashMap<>();
        ListItem<Integer> temp = this.head;
        ListItem<Integer> prev = null;
        while (temp != null){
            ListItem<Integer> current = temp; //50
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

}
