import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {

                List<TaskActivity> tasks = new ArrayList<>();
                tasks.add(new TaskActivity(10,11));
                tasks.add(new TaskActivity(8,10));
                tasks.add(new TaskActivity(1,3));
                tasks.add(new TaskActivity(2,7));
                tasks.add(new TaskActivity(2,5));
                tasks.add(new TaskActivity(3,4));
                tasks.add(new TaskActivity(5,7));
                tasks.add(new TaskActivity(8,11));

                List<List<TaskActivity>> allCombinations = new ArrayList<>();
                display(tasks,null,new ArrayList<TaskActivity>(),allCombinations);

                int large = 0;
                for (var list: allCombinations) {
                        if(list.size()>large){
                                large = list.size();
                        }
                }

                System.out.println(large);
                for (var list: allCombinations) {
                        if(list.size() == large){
                                for (var item: list) {
                                        System.out.print("[" + item.start + "-" + item.end + "] ");
                                }
                                System.out.println();
                        }
                }


        }

        private static void display(List<TaskActivity> tasks,TaskActivity prev, List<TaskActivity> currentItems,List<List<TaskActivity>> allCombinations) {
                for (var item : tasks) {
                        if(prev == null || prev.end <= item.start){
                                List<TaskActivity> items = new ArrayList<>(currentItems);
                                items.add(item);
                                allCombinations.add(items);
                                display(tasks,item,items,allCombinations);
                        }

                }
        }


}