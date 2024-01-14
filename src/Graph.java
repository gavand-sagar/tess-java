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
        return hasPathHelper(start,end,new HashSet<>(),1);
    }


    private boolean hasPathHelper(int start, int end,Set<Integer> visited,int edgeCount) {
        if(visited.contains(start)){
            return false;
        }
        System.out.print(start+"\t");
        Set<Integer> points = items.get(start);
        if(points == null){
            return false;
        }
        if(points.contains(end)){
            System.out.print(end);
            System.out.print("EDGES- " + edgeCount);
            return true;
        }else{
            boolean flag = false;
            for (int point:points) {
                if(hasPathHelper(point,end,visited,edgeCount+1)){
                    flag = true;
                    break;
                }
            }
            return flag;
        }
    }

    @Override
    public void displayAllPaths(int start,int end) {
        displayAllPathHelper(start,end,new HashSet<>());
    }

    public void displayAllPathHelper(int start,int end,Set<Integer> visited){
        if(visited.contains(start)){
            return;
        }
        Set<Integer> points = items.get(start);
        if(points == null){
            return;
        }
        for (int point:points) {
            if(hasPath(start,end)){
                displayAllPathHelper(point,end,visited);
            }
        }

    }

}
