import java.util.HashMap;
import java.util.Map;

public class Main {
        static  IGraph graph = new Graph();
        public static void main(String[] args) {

                graph.addNode(2);
                graph.addNode(3);
                graph.addNode(4);
                graph.addNode(5);


               graph.addPath(6,8);

               graph.addPath(6,7);
               graph.addPath(7,9);
               graph.addPath(9,10);
               graph.addPath(10,8);


               graph.hasPath(6,8);

        }



}