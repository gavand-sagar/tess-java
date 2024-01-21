public interface IGraph {
    void addPoint(String point);
    void addPath(String start,String end);
    boolean checkPath(String start,String end);
    void deletePoint(String point);
    void updatePoint(String oldValue,String newValue);
}
