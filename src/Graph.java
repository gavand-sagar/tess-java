public class Graph implements IGraph{
    private boolean[][] edges = new boolean[100][100]; // private in class
    @Override
    public void addPath(int start, int end) {
        edges[start][end] = true;  // this logic will go in the addPath method
        edges[end][start] = true;
    }

    @Override
    public void removePath(int start, int end) {
        edges[start][end] = false;
        edges[end][start] = false;
    }

    @Override
    public boolean hasPath(int start, int end) {
        return edges[start][end];
    }
}
