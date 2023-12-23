import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            MyMenu menu = new MyMenu();
            for (var entry: menu.myMenuItems.entrySet()) {
                System.out.println(entry.getKey() + " ==> " + entry.getValue().getMenuName());
            }

            System.out.println("Enter choice:");
            String choice = scanner.nextLine();
            if(menu.myMenuItems.containsKey(choice)){
                menu.myMenuItems.get(choice).perform();
            }


        }

}