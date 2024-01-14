public interface IGraph {
    void addNode(int item);
    void addPath(int start,int end);
    void removePath(int start,int end);
    boolean hasPath(int start,int end);
    void displayAllPaths(int start);
}
