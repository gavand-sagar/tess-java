
public class Main {
        public static void main(String[] args) {

                ITree tree = new Tree();
                tree.insertValue(50);
                tree.insertValue(30);
                tree.insertValue(70);
                tree.insertValue(60);
                tree.insertValue(40);

                if(tree.find(170)){
                        System.out.println("FOUND");
                }else {
                        System.out.println("NOT-FOUND");
                }


        }


}