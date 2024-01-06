
public class Main {
        public static void main(String[] args) {

                ITree tree = new Tree();

                tree.insertValue("Orange");
                tree.insertValue("Apple");
                tree.insertValue("Mango");
                tree.insertValue("Kiwi");
                tree.insertValue("Banana");

                System.out.println("Total: " + tree.total());

//                tree.display();
//                System.out.println();
//                System.out.println();
//                System.out.println();
//                tree.displayInAscOrder();

//                if(tree.find("Grape")){
//                        System.out.println("FOUND");
//                }else{
//                        System.out.println("NOT_FOUND");
//                }
        }


}