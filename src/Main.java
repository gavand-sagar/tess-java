import java.util.HashMap;
import java.util.Map;

public class Main {
        static  IGraph graph = new Graph();
        public static void main(String[] args) {

                graph.addNode(2);
                graph.addNode(3);
                graph.addNode(4);
                graph.addNode(5);


                graph.addPath(2,4);
                graph.addPath(2,5);
                graph.addPath(3,2);
                graph.addPath(3,4);
                graph.addPath(5,4);
                graph.addPath(5,2);

               graph.displayAllPaths(3);

        }



}