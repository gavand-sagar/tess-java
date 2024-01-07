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
