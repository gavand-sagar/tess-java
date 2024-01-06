public class Tree implements ITree{

    private Point root = null;
    private  int size = 0;
    @Override
    public void displayInAscOrder(){
        displayInAscOrder(this.root);
    }

    public  static void displayInAscOrder(Point p){
        if(p != null){
            displayInAscOrder(p.getLeft());
            System.out.print(p.getValue() + " ");
            displayInAscOrder(p.getRight());
        }
    }
    private int temp = 0;
    @Override
    public int total(){
        temp = 0;
        total(this.root);
        return temp;
    }

    public void total(Point p){
        if(p != null){
            temp++;
            total(p.getLeft());
            total(p.getRight());
        }
    }


    @Override
    public void display() {
        display(root,"");
    }

    public  static  void display(Point p,String indentation){
        if(p != null){
            System.out.println(indentation + "-" + p.getValue());
            display(p.getLeft(),indentation + " L");
            display(p.getRight(),indentation + " R");
        }
    }


    @Override
    public void insertValue(String value) {
        this.insertValue(this.root,value);
    }

    @Override
    public boolean find(String value) {
            //implement the logic here
            return find(this.root,value);
    }

    private boolean find(Point p, String value) {
        //implement the logic here
        if(p == null){
            return false;
        }
        if(p.getValue().equals(value)){
            return  true;
        }else if(value.compareTo(p.getValue()) < 0){
            return find(p.getLeft(),value);
        }else{
            return find(p.getRight(),value);
        }

    }


    private void insertValue(Point root, String value) {
        if(root == null){
            this.root = new Point(value);
            size++;
            return;
        }

        if(value.compareTo(root.getValue()) < 0){
            if(root.getLeft() == null){
                root.setLeft(new Point(value));
                size++;
                return;
            }
            else{
                insertValue(root.getLeft(),value);
            }
        }
        if(value.compareTo(root.getValue()) > 0){
            if(root.getRight() == null){
                root.setRight(new Point(value));
                size++;
                return;
            }else{
                insertValue(root.getRight(),value);
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
