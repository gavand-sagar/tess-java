import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph implements IGraph{

    private Map<Integer, Set<Integer>> items = new HashMap<>();

    @Override
    public void addNode(int item) {
        items.put(item,new HashSet<Integer>());
    }

    @Override
    public void addPath(int start, int end) {
        Set<Integer> points = items.get(start);
        if(points == null){
            items.put(start,new HashSet<>());
            points = items.get(start);
        }
        points.add(end);
        items.put(start,points);
    }

    @Override
    public void removePath(int start, int end) {
        Set<Integer> points = items.get(start);
        if(points == null){
            return;
        }
        points.remove(end);
        items.put(start,points);
    }

    @Override
    public boolean hasPath(int start, int end) {
        Set<Integer> points = items.get(start);
        if(points == null){
            return false;
        }
        return  points.contains(end);
    }

    @Override
    public void displayAllPaths(int start) {
        displayAllPathHelper(start,new HashSet<>());
    }

    public void displayAllPathHelper(int start,Set<Integer> visited){
        if(visited.contains(start)){
            return;
        }
        Set<Integer> points = items.get(start);
        if(points == null){
            return;
        }
        for (int item:points) {
            System.out.println(start+" --> "+item);
            visited.add(start);
            displayAllPathHelper(item,visited);
        }
    }

}
