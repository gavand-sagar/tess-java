import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class  User{
        public String username;
        public String email;

        public User(String username, String email) {
                this.username = username;
                this.email = email;
        }
}
public class Main {
        public static void main(String[] args) {
        // Maps makes search fast

//        String[]  fruits = new String[] {"Apple","Banana","Grape","Mango"};
//
//        String find = "Apple";
//
//        for (String str:fruits) {
//                if(find.equals(str)){
//                        System.out.println("Found");
//                }
//        }
        Scanner scanner = new Scanner(System.in);
          Map<String,String> map = new HashMap<>();
          String input = "";
          while (true){
              System.out.println("Enter name:");
              input = scanner.nextLine();
              if(input.equals("")){
                  break;
              }else{
                  map.put(input,input);
              }
          };

//            System.out.println("All values");
//            for (var item : map.values()) {
//                System.out.print(item  + ", ");
//            }

            System.out.println("Enter name to find: ");
            input = scanner.nextLine();
            if (map.containsKey(input)){
                System.out.println("Found");
            }else{
                System.out.println("Not found");
            }

          // put
          // containsKey

          // enter name
                //sagar
          // enter name
                //rahul
          // enter name
                //jay
          // enter name
                //

          //Enter name to find
                //rahul
          // rahul does exists



    }
}