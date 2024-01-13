public interface IGraph {
    void addPath(int start,int end);
    void removePath(int start,int end);
    boolean hasPath(int start,int end);
}
