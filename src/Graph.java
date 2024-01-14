import java.util.ArrayList;
import java.util.List;

public class Graph implements IGraph{
    private boolean[][] edges = new boolean[6][6]; // private in class
    @Override
    public void addPath(int start, int end) {
        edges[start][end] = true;  // this logic will go in the addPath method
    }

    @Override
    public void removePath(int start, int end) {
        edges[start][end] = false;
    }

    // 6,9

    List<Integer> countedItem = new ArrayList<>();

    @Override
    public boolean hasPath(int start, int end) {
        countedItem = new ArrayList<>();
        return hasPathHelper(start, end);
    }

    @Override
    public void displayAdjacencyMatrix() {
        for (int i = 1; i < 6; i++) {
            System.out.print("\t" + i);

        }
        System.out.println();
        for (int i = 2; i < 6; i++) {
            for (int j = 1; j<6; j++){
                if(j==1){
                    System.out.print("\t" + i);
                }else{
                    System.out.print("\t" + (edges[i][j]?"1":"0"));
                }

            }
            System.out.println();
        }
    }

    private boolean hasPathHelper(int start, int end) {

        if(this.edges[start][end]){
            return true;
        }else{
            List<Integer> connectingPoints = getConnectingPoints(start); // 7,8;
            boolean temp = false;
            for (int connection: connectingPoints) {
                if(!countedItem.contains(connection) && hasPath(connection, end)){
                    temp = true;
                    break;
                }
            }
            return temp;
        }
    }


    private List<Integer> getConnectingPoints(int point){
        countedItem.add(point);
        List<Integer> array = new ArrayList<>();
        for(int i = 0;i < 100;i++){
            if(edges[point][i]){
                array.add(i);
            }
        }
        return  array;
    }


}
