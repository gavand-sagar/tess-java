public interface IGraph {
    void addPoint(String point);
    void addEdge(String start,String end,int distance);
    int distance(String start,String end);

    int distanceV2(String start,String end);

    void dijkshtra(String start);


}
