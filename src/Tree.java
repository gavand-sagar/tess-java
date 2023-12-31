public class Tree implements ITree{

    private Point root = null;
    private  int size = 0;
    @Override
    public void display() {
        display(root,"");
    }
    public void display(Point p,String indentation){
        if(p != null){
            System.out.println(indentation + "-" + p.getValue());
            display(p.getLeft(),indentation + " L");
            display(p.getRight(),indentation + " R");
        }
    }

    int getHeight(Point p){
        if(p == null){
            return 0;
        }else{
            return p.getHeight();
        }
    }

    int getBalance(Point p){
        if(p == null){
            return 0;
        }else{
            return getHeight(p.getLeft()) - getHeight(p.getRight());
        }
    }



    @Override
    public void insertValue(int value) {
        this.root = this.insertValue(this.root,value);
    }

    private Point insertValue(Point root, int value) {
        if(root == null){
            return new Point(value);
        }
        if(value < root.getValue()){
            root.setLeft(insertValue(root.getLeft(),value));
        }else if (value > root.getValue()){
            root.setRight(insertValue(root.getRight(),value));
        }else{
            return root; // duplicate entry
        }

        root.setHeight(Math.max(getHeight(root.getLeft()),getHeight(root.getRight())) + 1);


        int balance = getBalance(root);

        if(balance <= -1 && value > root.getRight().getValue()){
            return leftRotate(root);
        }
        if(balance <= -1 && value < root.getRight().getValue()){
            root.setRight(rightRotate(root.getRight()));
            return leftRotate(root);
        }

        if(balance >= 1 && value < root.getLeft().getValue()){
            return rightRotate(root);
        }

        if(balance >= 1 && value > root.getLeft().getValue()){
            root.setLeft(leftRotate(root.getLeft()));
            return rightRotate(root);
        }


        return root;
    }


    Point leftRotate(Point x){
        Point y = x.getRight();
        Point T2 = y.getLeft();

        y.setLeft(x);
        x.setRight(T2);

        x.setHeight(Math.max(getHeight(x.getLeft()),getHeight(x.getRight())) + 1);
        y.setHeight(Math.max(getHeight(y.getLeft()),getHeight(y.getRight())) + 1);
        return y;
    }

    Point rightRotate(Point p){
        Point temp = p.getLeft();
        Point temp2 = temp.getRight();

        temp.setRight(p);
        p.setLeft(temp2);

        p.setHeight(Math.max(getHeight(p.getLeft()),getHeight(p.getRight())) + 1);
        temp.setHeight(Math.max(getHeight(temp.getLeft()),getHeight(temp.getRight())) + 1);
        return temp;
    }



    @Override
    public boolean find(int value) {
            //implement the logic here
            return find(this.root,value);
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



    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
