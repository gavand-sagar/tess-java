public class Main {
        private static IPriorityQueue queue = new MyPriorityQueue();
        public static void main(String[] args) throws Exception {


            queue.enqueue(23,0);
            queue.enqueue(30,0);
            queue.enqueue(45,1);
            queue.enqueue(50,2);
            queue.enqueue(60,2);
            queue.enqueue(90,1);
            queue.enqueue(100,3);
            Object o = 56;
            while (queue.size()>0){
                System.out.println(queue.dequeue());
            }

        }


}