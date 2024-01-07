import java.util.*;

public class Main {
        public static void main(String[] args) {
            deleteFromTree();
        }

        public static void deleteFromTree(){
                ITree tree1 = new Tree();
                tree1.insertValue(50);
                tree1.insertValue(40);
                tree1.insertValue(70);
                tree1.insertValue(60);
                tree1.insertValue(80);
                tree1.display();
                System.out.println();
                System.out.println();
                tree1.delete(70);
                tree1.display();

        }

        public static void treeFromUser(){
                ITree tree = new Tree();
                Scanner scanner = new Scanner(System.in);
                while (true){
                        System.out.println("Enter number");
                        int number = scanner.nextInt();
                        if(number > 0){
                            tree.insertValue(number);
                        }else{
                                break;
                        }
                }


                tree.display();
                System.out.println(tree.asCollection());
        }

        public static void collectionFromTree(){
                ITree tree1 = new Tree();
                tree1.insertValue(45);
                tree1.insertValue(30);
                tree1.insertValue(60);
                tree1.insertValue(35);
                tree1.insertValue(20);
                tree1.insertValue(50);
                tree1.insertValue(70);


                List<Integer> item =  tree1.asCollection();

                System.out.println(item);

        }


        private static void treeFromCollection() {
                List<Integer> items = new ArrayList<Integer>();
                items.add(50);
                items.add(30);
                items.add(70);
                items.add(40);
                items.add(60);

                ITree tree1 = new Tree(items,false); // if parameterized constructor then we cannot insert new
                tree1.insertValue(45);
                tree1.insertValue(7453);
                tree1.insertValue(534);
                tree1.insertValue(345);
                tree1.insertValue(34455);
                tree1.insertValue(8765);
                tree1.display();
        }


}