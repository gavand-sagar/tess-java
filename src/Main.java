public class Main {
        static  ICircularLinkedList<Float> myList = new CircularLinkedList<Float>();
        public static void main(String[] args) throws Exception {
            myList.insertAt(0,56.f);
            myList.insertAt(1,12.f);
            myList.insertAt(2,90.f);
            myList.insertAt(3,55.f);
            myList.displayAll();


        }
}