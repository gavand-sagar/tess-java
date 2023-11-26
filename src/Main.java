public class Main {
        private static IMyDoublyLinkedList list = new MyDoublyLinkedList();
        public static void main(String[] args) throws Exception {

            list.insertElementAt(0,"Rohit");
            list.insertElementAt(1,"Payal");
            list.insertElementAt(2,"Nisha");
            list.insertElementAt(3,"Sagar");
            list.insertElementAt(4,"Rahul");


            list.displayForwards();
            System.out.println("\n======= after delete at 0 =======");
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