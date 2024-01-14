import java.util.HashMap;
import java.util.Map;

public class Main {
        static IGraph graph = new Graph();
        public static void main(String[] args) {

                graph.addPath(6,1);

                graph.displayAdjacencyMatrix();




        }

        public static void Fundamental(){
                boolean[][] edges = new boolean[100][100]; // private in class

                edges[7][5] = true;  // this logic will go in the addPath method
                edges[5][7] = true;

                //this will go in hasPath method
                if(edges[4][6] == true){
                        System.out.println("Path available");
                }else{
                        System.out.println("Path Not available");
                }

                // Class with addPath method    graph.addPath(7,5) -- add a path
                // check If path exists method.    graph.hasPath(7,5)  --> return true
        }

}