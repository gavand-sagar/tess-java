import java.util.ArrayList;
import java.util.List;

public class Tree implements ITree{
    private Point root = null;
    private  int size = 0;
    private boolean isReadOnly = false;

    public Tree() {
        this.isReadOnly = false;
    }


    public Tree(List<Integer> items) {
        this.isReadOnly = true;
        for (int value: items) {
            this.insertValue(this.root,value);
        }
    }

    public Tree(List<Integer> items,boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
        for (int value: items) {
            this.insertValue(this.root,value);
        }
    }

    List<Integer> tempCollection;
    @Override
    public List<Integer> asCollection(){
        tempCollection = new ArrayList<>();
        asCollection(this.root);
        return tempCollection;
    }

    private void asCollection(Point p){
      if(p!=null){
          asCollection(p.getLeft());
          tempCollection.add(p.getValue());
          asCollection(p.getRight());
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
    public void insertValue(int value) {
        if(isReadOnly){
            return;
        }
        this.insertValue(this.root,value);
    }

    @Override
    public boolean find(int value) {
            //implement the logic here
            return find(this.root,value);
    }

    private Point findPoint(Point p, int value) {
        //implement the logic here
        if(p == null){
            return null;
        }
        if(p.getValue() == value){
            return  p;
        }else if(value < p.getValue()){
            return findPoint(p.getLeft(),value);
        }else{
            return findPoint(p.getRight(),value);
        }

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

    private int getPrev(int input){
        Point point = findPoint(this.root,input);
        if(point != null){
            Point left = point.getLeft();
            while (left.getRight() != null){
                left = left.getRight();
            }
            return left.getValue();
        }

        return 0;
    }


    @Override
    public  void delete(int value){
        Point temp = this.root;
        while (temp != null){
            if(temp.getValue() == value) {
                return;
            }else if (temp.getValue() > value){
                //left
                if(temp.getLeft().getValue() == value){
                    //deletion;
                    //if its a leaf node?
                    if(temp.getLeft().isLeaf()){
                        temp.setLeft(null);
                        return;
                    }else if(temp.getLeft().hasSingleChild()){
                        Point singleChild = temp.getLeft().getSingleChild();
                        temp.setLeft(singleChild);
                        return;
                    }else if(temp.getLeft().hasBothChild()){
                        //replace with prev or next
                         int prev = getPrev(temp.getLeft().getValue());
                        delete(prev);
                        temp.getLeft().setValue(prev);
                        return;
                    }
                    break;
                }else{
                    temp = temp.getLeft();
                }
            }else{
                //right
                if(temp.getRight().getValue() == value){
                    //deletion;
                    //if its a leaf node?
                    if(temp.getRight().isLeaf()){
                        temp.setRight(null);
                        return;
                    }else if(temp.getRight().hasSingleChild()){
                        Point singleChild = temp.getRight().getSingleChild();
                        temp.setRight(singleChild);
                        return;
                    }else if(temp.getRight().hasBothChild()){
                        //replace with prev or next
                        int prev = getPrev(temp.getRight().getValue());
                        System.out.println("prev - " + prev);
                        delete(prev);
                        temp.getRight().setValue(prev);
                        return;
                    }
                }else{
                    temp = temp.getRight();
                }
            }
        }
    }
}
