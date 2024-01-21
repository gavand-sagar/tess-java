import java.util.*;

public class Graph implements IGraph{
    Map<String, Set<String>> graph = new HashMap<>();
    private boolean undirected = false;

    public Graph() {
        this.undirected = false;
    }

    public Graph(boolean undirected) {
        this.undirected = undirected;
    }


    @Override
    public void addPoint(String point) {
        graph.put(point,new HashSet<>());
    }

    @Override
    public void addPath(String start, String end) {
        addPathHelper(start, end);
        if(undirected){
            addPathHelper(end, start);
        }

    }

    private void addPathHelper(String start, String end) {
        if(!graph.containsKey(start)){
            addPoint(start);
        }
        Set<String> points = graph.get(start);
        points.add(end);
        graph.put(start,points);
    }

    @Override
    public boolean checkPath(String start, String end) {
        return checkPathHelper(start,end,new ArrayList<>());
    }

    @Override
    public void deletePoint(String point) {
        graph.remove(point);
        for (String key : graph.keySet()) {
            Set<String> destinations = graph.get(key);
            destinations.remove(point);
            graph.put(key,destinations);
        }
    }

    @Override
    public void updatePoint(String oldValue, String newValue) {
        Set<String> oldDestinations = new HashSet<>(graph.get(oldValue));
        graph.remove(oldValue);
        graph.put(newValue,oldDestinations);


        for (String key : graph.keySet()) {
            Set<String> destinations = graph.get(key);
            if(destinations.contains(oldValue)){
                destinations.remove(oldValue);
                destinations.add(newValue);
                graph.put(key,destinations);
            }
        }

    }

    private boolean checkPathHelper(String start, String end, List<String> visited) {
        if(visited.contains(start)){
            return false;
        }
        visited.add(start);
        if(!graph.containsKey(start)){
            return  false;
        }
        Set<String> canBeConnectedTo = graph.get(start);
        if(canBeConnectedTo.contains(end)){
            visited.add(end);
            System.out.println(visited);
            return true;
        }else{
            for (String item: canBeConnectedTo) {
                if(checkPathHelper(item,end,visited)){
                    return true;
                }
            }
            return false;
        }
    }
}
