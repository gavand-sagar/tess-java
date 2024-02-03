import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

                List<Person> people = new ArrayList<Person>();
                people.add(new Person(1,"Shrikrishna"));
                people.add(new Person(2,"Pavan"));
                people.add(new Person(3,"Swati"));
                people.add(new Person(4,"Vinitha"));


                if(search(people,"Shrikrishna")){
                        System.out.println("Found");
                }else{
                        System.out.println("Not found");
                }



        }
        public static boolean search(int[] array, int itemToFind){
                boolean flag = false;
                for (int element : array) {
                        if (element == itemToFind) {
                                flag = true;
                                break;
                        }
                }
                return flag;
        }

        public static boolean search(List<Person> list, String name){
                for (Person p: list) {
                        if(p.name.equals(name)){
                                return true;
                        }
                }
                return false;
        }


}