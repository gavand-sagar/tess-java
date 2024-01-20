import java.util.*;

public class Graph implements IGraph{

    Map<String, Map<String,Integer>> data;

    public Graph() {
        this.data = new HashMap<>();
    }

    @Override
    public void addPoint(String point) {
        this.data.put(point,new HashMap<>());
    }

    @Override
    public void addEdge(String start, String end, int distance) {
            Map<String,Integer> point = this.data.get(start);
            point.put(end,distance);
            this.data.put(start,point);
    }

    @Override
    public int distance(String start, String end) {
        return distanceHelper(start,end,new ArrayList<>(),0);
    }

    @Override
    public int distanceV2(String start, String end) {
        return distanceV2Helper(start,end,new ArrayList<>(),0);
    }


    private int distanceV2Helper(String start, String end, List<String> visited, int distance){
        if(visited.contains(start)){
            return -1;
        }
        visited.add(start);

        Map<String,Integer> canVisitList = this.data.get(start);

        int shortestDistance = 99999999;

        if(canVisitList.containsKey(end)){
            shortestDistance = distance + canVisitList.get(end);
        }

        for (String p: canVisitList.keySet()) {
            int newDistance = distanceHelper(p,end,visited,canVisitList.get(p));
            if(newDistance != -1){
                if(newDistance < shortestDistance){
                    shortestDistance = newDistance;
                }
            }
        }

        return shortestDistance;



    }

    @Override
    public void dijkshtra(String start) {

    }

    // List<String> visited = new ArrayList<>();

    private int distanceHelper(String start, String end, List<String> visited, int distance){
        if(visited.contains(start)){
            return -1;
        }
        visited.add(start);
        if(!this.data.containsKey(start)){
            return -1;
        }
        Map<String,Integer> point = this.data.get(start);
        //if direct path available
        if(point.containsKey(end)){
            visited.add(end);
            System.out.println(visited);
            return distance + point.get(end);
        }else{
            int anyDistance = -1;
            for (String p: point.keySet()) {
                anyDistance = distanceHelper(p,end,visited,point.get(p));
                if(anyDistance>-1){
                    break;
                }
            }
            if(anyDistance>-1) {
                return distance + anyDistance;
            }else{
                return -1;
            }
        }
    }

}
