public class Tree implements ITree{

    private Point root = null;
    private  int size = 0;
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
    public void insertValue(int value) {
        this.insertValue(this.root,value);
    }

    @Override
    public boolean find(int value) {
            //implement the logic here
            return find(this.root,value);
    }

    @Override
    public int min() {
        if(this.root == null){
            return 0;
        }
        Point temp = this.root;
        while (temp.getLeft() != null){
            temp = temp.getLeft();
        }
        return temp.getValue();
    }

    @Override
    public int max() {
        if(this.root == null){
            return 0;
        }
        Point temp = this.root;
        while (temp.getRight() != null){
            temp = temp.getRight();
        }
        return temp.getValue();
    }

    private boolean find(Point p, int value) {
        //implement the logic here
        if(p == null){
            return false;
        }
        if(p.getValue() == value){
            return  true;
        }else if(value < p.getValue()){
            return find(p.getLeft(),value);
        }else{
            return find(p.getRight(),value);
        }

    }


    private void insertValue(Point root, int value) {
        if(root == null){
            this.root = new Point(value);
            size++;
            return;
        }

        if(value < root.getValue()){
            if(root.getLeft() == null){
                root.setLeft(new Point(value));
                size++;
                return;
            }
            else{
                insertValue(root.getLeft(),value);
            }
        }
        if(value > root.getValue()){
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
