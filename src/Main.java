public class Main {
        static  ICircularLinkedList myList = new CircularLinkedList();
        public static void main(String[] args) throws Exception {
            myList.insertAt(0,50);
            myList.insertAt(1,70);
            myList.insertAt(2,80);
            myList.insertAt(3,30);
            myList.displayAll();

        }
}