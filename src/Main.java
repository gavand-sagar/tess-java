import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import  java.util.Queue;
public class Main {
        public static void main(String[] args) {
            //write a program to sort a queue
            // NORMAL Queue to Sorted
            Queue<Integer> queue = new LinkedList<>();
            queue.add(45);
            queue.add(90);
            queue.add(20);
            queue.add(30);
            queue.add(54);
            queue.add(61);


            toSorted(queue);
            while (!queue.isEmpty()){
                System.out.print(queue.remove() + "\t");
            }

            //create normal queue and add data in it
            //shift all data into a priority queue
            //print priority queue

//            Queue<Integer> queue = new PriorityQueue<>();
//            queue.add(56);
//            queue.add(40);
//            queue.add(23);
//            queue.add(70);
//
//            while (!queue.isEmpty()){
//                System.out.println(queue.remove());
//            }

    }


    public static void toSorted(Queue<Integer> queue){
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        while (!queue.isEmpty()){
            priorityQueue.add(queue.remove());
        }

        while (!priorityQueue.isEmpty()){
            queue.add(priorityQueue.remove());
        }
    }

}