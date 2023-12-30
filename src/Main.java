
public class Main {
        public static void main(String[] args) {

                ITree tree = new Tree();
                tree.insertValue(50);
                tree.insertValue(30);
                tree.insertValue(70);
                tree.insertValue(16);
                tree.insertValue(40);
                tree.insertValue(55);
                tree.insertValue(6);

                System.out.println("MIN- " + tree.min());
                System.out.println("MAX- " + tree.max());

        }


}