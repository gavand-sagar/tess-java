public class Main {
        public static void main(String[] args) throws Exception {

         // create queue using stacks

                Queue c = new Queue();
                c.enqueue(4);
                c.enqueue(5);
                c.enqueue(7);

            System.out.println(c.dequeue());
            System.out.println(c.size());
            System.out.println(c.dequeue());
            System.out.println(c.size());

        // keep stack obj as storage
        // push will be same as stack , so we will do a direct push
        // for pop, we will calculate first element and rearrange stack



    }
}