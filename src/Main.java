import java.util.HashMap;
import java.util.Map;

public class Main {

        static IGraph graph = new Graph();
        public static void main(String[] args) {

                graph.addPoint("Mumbai");
                graph.addPoint("Delhi");
                graph.addPoint("Bangalore");
                graph.addPoint("Chennai");

                graph.addEdge("Mumbai","Bangalore",200);

                graph.addEdge("Mumbai","Chennai",20);
                graph.addEdge("Chennai","Bangalore",20);



//                System.out.println(graph.distance("Mumbai","Bangalore"));

                System.out.println(graph.distanceV2("Mumbai","Bangalore"));

        }


}