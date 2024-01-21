import java.util.Scanner;

public class Main {
        static Scanner scanner = new Scanner(System.in);
        static IGraph graph = new Graph(false);
        public static void main(String[] args) {
            displayMenu();
        }

        private static void displayMenu() {

            System.out.println("==========PICK AN OPTION==========");
            System.out.println("1. Add a Point");
            System.out.println("2. Add a connection");
            System.out.println("3. Check for a connection");
            System.out.println("4. Update Point");
            System.out.println("5. Delete a Point");
            System.out.println("6. Exit");
            System.out.println("Please enter your choice: ");
            String input = scanner.nextLine();
            switch (input){
                case "1":
                    addPointToGraph();
                    break;
                case "2":
                    addConnection();
                    break;
                case "3":
                    checkConnection();
                    break;
                case "4":
                    updatePoint();
                    break;
                case "5":
                    deletePoint();
                    break;
                case "6":
                    exitApp();
                    break;
            }
            scanner.nextLine();
            displayMenu();

        }

    private static void deletePoint() {
        System.out.println("Enter something to Delete: ");
        String input = scanner.nextLine();
        graph.deletePoint(input);
        System.out.println("Point deleted successfully.");
    }

    private static void updatePoint() {
        System.out.println("Enter point to be updated: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter new value: ");
        String input2 = scanner.nextLine();
        graph.updatePoint(input1,input2);
        System.out.println("Point updated successfully.");
    }

    private static void exitApp() {
        System.out.println("App Stopped....");
    }

    private static void checkConnection() {
        System.out.println("Enter starting point: ");
        String input1  = scanner.nextLine();
        System.out.println("Enter ending point: ");
        String input2  = scanner.nextLine();
        if(graph.checkPath(input1,input2)){
            System.out.println("Connection exists.");
        }else{
            System.out.println("Connection doesn't exists.");
        }
    }

    private static void addConnection() {
        System.out.println("Enter starting point: ");
        String input1  = scanner.nextLine();
        System.out.println("Enter ending point: ");
        String input2  = scanner.nextLine();
        graph.addPath(input1,input2);
        System.out.println("Connection added successfully.");
    }

    private static void addPointToGraph() {
        System.out.println("Enter something to Add: ");
        String input = scanner.nextLine();
        graph.addPoint(input);
        System.out.println("Point added successfully.");
    }


}