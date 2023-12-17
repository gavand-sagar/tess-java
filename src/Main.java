import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
        public static void main(String[] args) {


            int[] array =  new int[]{6,17,1,9,1};
            int windowSize = 4;

            for (int i = 0; i <= (array.length - windowSize); i++) {
                //
                Queue<Integer> q = new PriorityQueue<Integer>(windowSize, Collections.reverseOrder());
                for (int j = i; j < (i+windowSize); j++) {
                    q.add(array[j]);
                }

                System.out.println( q.peek());;
            }


//            Queue<Integer> array = new LinkedList<>();
//            array.add(6);
//            array.add(7);
//            array.add(3);
//            array.add(5);
//            array.add(8);
//
//            int windowSize = 3;
//
//            while (array.size() >= windowSize){
//               int current =  array.remove();
//               int next = array.remove();
//               int next = array.peek();
//                System.out.print(Math.max(current,next)+", ");
//            }

            // Find maximum of a sliding window of size 3 in a queue

            // [6,7,3,5]

            // 7,7,5
            // sliding window of length 2



    }
}