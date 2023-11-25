import java.util.ArrayList;

public class Main {
        public static void main(String[] args) throws Exception {

             IMyLinkedList<Float> list = new MyLinkedList<Float>();
             list.insertAt(0,5.6f);
             list.insertAt(1,5.78f);
             list.insertAt(2,797.3f);

                  System.out.println("Total: " + list.size());
                  list.display();
             list.swap(0,2);
                System.out.println("Total: " + list.size());
                list.display();                                
             list.updateAt(0,78f);
              System.out.println("Total: " + list.size()); 
              list.display();

             list.removeAt(0);
             System.out.println("Total: " + list.size());  
             list.display();

            System.out.println("Value at [1]: " + list.getValueAt(1));

        }

}
