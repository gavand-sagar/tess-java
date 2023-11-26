public class Main {
        private static IMyDoublyLinkedList<Float> list = new MyDoublyLinkedList<Float>();
        public static void main(String[] args) throws Exception {

            list.insertElementAt(0,67.4f);
            list.insertElementAt(1,69.4f);
            list.insertElementAt(2,57.4f);
            list.insertElementAt(3,90.4f);
            list.insertElementAt(4,78.4f);


            list.displayForwards();
            System.out.println("\n======= after delete at 0 =======");
            list.removeElementFrom(0);
            list.displayForwards();






//            ListNode rohit = new ListNode("Rohit",null,null);
//            ListNode payal = new ListNode("Payal",null,rohit);
//            ListNode nisha = new ListNode("Nisha",null,payal);
//            ListNode pratik = new ListNode("Pratik",null,nisha);
//            rohit.setNext(payal);
//            payal.setNext(nisha);
//            nisha.setNext(pratik);
//
//            displayForward(nisha);
//            displayBackwards(nisha);
        }


}